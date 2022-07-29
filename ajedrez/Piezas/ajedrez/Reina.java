package ajedrez;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Reina extends Pieza {
	private static final long serialVersionUID = 1L;

	public Reina(String bando) {
		super();
		super.bando  = bando;
		String nombre = "Images/" + bando + "/reina.png";
		this.icon = new ImageIcon(nombre);
	}

	@Override
	public ArrayList<ButtonIndex> posDisponibles(ButtonIndex posicion, ButtonIndex[][] botones) {
		ArrayList<ButtonIndex> disponibles = new ArrayList<ButtonIndex>();
		int fila = posicion.getRow(), columna = posicion.getColumn();
		int suma = fila + columna, resta = fila - columna;
		
		for(int i = fila; i <= 7; i++) {
			for(int j = columna; j <= 7; j++) {
				if(i - j == resta || i == fila) {
					
				}
			}
		}
		
		return disponibles;
	}
}
