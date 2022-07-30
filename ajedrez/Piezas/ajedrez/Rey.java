package ajedrez;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Rey extends Pieza {
	private static final long serialVersionUID = 1L;

	public Rey(String bando) {
		super();
		super.bando  = bando;
		String nombre = "Images/" + bando + "/rey.png";
		this.icon = new ImageIcon(nombre);
	}

	@Override
	public ArrayList<ButtonIndex> posDisponibles(ButtonIndex posicion, ButtonIndex[][] botones) {
		ArrayList<ButtonIndex> disponibles = new ArrayList<ButtonIndex>();
		int fila = posicion.getRow(), columna = posicion.getColumn();

		for(int i = fila - 1; i <= fila + 1; i++) {
			for(int j = columna - 1; j <= columna + 1; j++) {
				if(i != fila || j != columna) {
					ButtonIndex candidata = botones[i][j];
					if(candidata.getOcupada()) {
						if(!candidata.getPieza().getBando().equals(this.getBando())) {
							candidata.getButton().setBackground(new Color(255,0,0,100));
							disponibles.add(candidata);
						}
					}else
						candidata.getButton().setBackground(new Color(0,255,0,100));
					disponibles.add(candidata);
				}
			}
		}
		return disponibles;
	}
}
