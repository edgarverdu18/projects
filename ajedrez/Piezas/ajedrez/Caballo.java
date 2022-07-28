package ajedrez;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Caballo extends Pieza {
	private static final long serialVersionUID = 1L;

	public Caballo(String bando) {
		super();
		super.bando  = bando;
		String nombre = "Images/" + bando + "/caballo.png";
		this.icon = new ImageIcon(nombre);
	}

	@Override
	public ArrayList<ButtonIndex> posDisponibles(ButtonIndex posicion, ButtonIndex[][] botones) {
		ArrayList<ButtonIndex> disponibles = new ArrayList<ButtonIndex>();
		for(int i = -2; i <= 2; i++) {
			for(int j = -2; j <= 2; j++) {
				int fila = posicion.getRow(), columna = posicion.getColumn();
				if((Math.abs(i) != Math.abs(j)) && i != 0 && j != 0) {
					fila += i; columna += j;
					if(fila >= 0 && fila <= 7 && columna >= 0 && columna <= 7) {
						if(botones[fila][columna].getOcupada()) {
							if(!botones[fila][columna].getPieza().getBando().equals(this.getBando())) {
								disponibles.add(botones[fila][columna]);
							}
						}else {
							disponibles.add(botones[fila][columna]);
						}
					}
				}
			}
		}
		
		return disponibles;
	}
}
