package ajedrez;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Torre extends Pieza {
	private static final long serialVersionUID = 1L;

	public Torre(String bando) {
		super();
		super.bando  = bando;
		String nombre = "Images/" + bando + "/torre.png";
		this.icon = new ImageIcon(nombre);
	}

	@Override
	public ArrayList<ButtonIndex> posDisponibles(ButtonIndex posicion, ButtonIndex[][] botones) {
		ArrayList<ButtonIndex> disponibles = new ArrayList<ButtonIndex>();
		int fila = posicion.getRow(), columna = posicion.getColumn();
		for(int i = fila - 1; i >= 0; i--) {
			if(botones[i][columna].getOcupada()) {
				if(!botones[i][columna].getPieza().getBando().equals(this.getBando())) {
					disponibles.add(botones[i][columna]);
					break;
				}else {
					break;
				}
			}else {
				disponibles.add(botones[i][columna]);
			}
		}

		for(int i = fila + 1; i <= 7; i++) {
			if(botones[i][columna].getOcupada()) {
				if(!botones[i][columna].getPieza().getBando().equals(this.getBando())) {
					disponibles.add(botones[i][columna]);
					break;
				}else {
					break;
				}
			}else {
				disponibles.add(botones[i][columna]);
			}
		}

		for(int i = columna - 1; i >= 0; i--) {
			if(botones[fila][i].getOcupada()) {
				if(!botones[fila][i].getPieza().getBando().equals(this.getBando())) {
					disponibles.add(botones[fila][i]);
					break;
				}else {
					break;
				}
			}else {
				disponibles.add(botones[fila][i]);
			}
		}
		
		for(int i = columna + 1; i <= 7; i++) {
			if(botones[fila][i].getOcupada()) {
				if(!botones[fila][i].getPieza().getBando().equals(this.getBando())) {
					disponibles.add(botones[fila][i]);
					break;
				}else {
					break;
				}
			}else {
				disponibles.add(botones[fila][i]);
			}
		}
		return disponibles;
	}
}
