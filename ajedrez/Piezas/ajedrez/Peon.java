package ajedrez;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Peon extends Pieza {
	private static final long serialVersionUID = 1L;

	public Peon(String bando) {
		super();
		super.bando  = bando;
		String nombre = "Images/" + bando + "/peon.png";
		this.icon = new ImageIcon(nombre);
	}

	@Override
	public ArrayList<ButtonIndex> posDisponibles(ButtonIndex posicion, ButtonIndex[][] botones) {
		ArrayList<ButtonIndex> disponibles = new ArrayList<ButtonIndex>();
		int fila = posicion.getRow(), columna = posicion.getColumn();

		if(this.getBando().equals("blancas")){
			if(!botones[fila - 1][columna].getOcupada()) {
				disponibles.add(botones[fila - 1][columna]);
				botones[fila - 1][columna].getButton().setBackground(new Color(0,255,0,100));
				if(fila == 6 && !botones[fila - 2][columna].getOcupada()) {
					disponibles.add(botones[fila - 2][columna]);
					botones[fila - 2][columna].getButton().setBackground(new Color(0,255,0,100));
				}
			}
			if(columna > 0) {
				if(botones[fila - 1][columna - 1].getOcupada() && botones[fila - 1][columna - 1].getPieza().getBando().equals("negras")){
					disponibles.add(botones[fila - 1][columna - 1]);
					botones[fila - 1][columna - 1].getButton().setBackground(new Color(255,0,0,100));
				}
			}
			if(columna < 7) {
				if(botones[fila - 1][columna + 1].getOcupada() && botones[fila - 1][columna + 1].getPieza().getBando().equals("negras")){
					disponibles.add(botones[fila - 1][columna + 1]);
					botones[fila - 1][columna + 1].getButton().setBackground(new Color(255,0,0,100));
				}
			}
		}
		else if(this.getBando().equals("negras")){
			if(!botones[fila + 1][columna].getOcupada()) {
				disponibles.add(botones[fila + 1][columna]);
				botones[fila + 1][columna].getButton().setBackground(new Color(0,255,0,100));
				if(fila == 1 && !botones[fila + 2][columna].getOcupada()) {
					disponibles.add(botones[fila + 2][columna]);
					botones[fila + 2][columna].getButton().setBackground(new Color(0,255,0,100));
				}
			}
			if(columna > 0) {
				if(botones[fila + 1][columna - 1].getOcupada() && botones[fila + 1][columna - 1].getPieza().getBando().equals("blancas")){
					disponibles.add(botones[fila + 1][columna - 1]);
					botones[fila + 1][columna - 1].getButton().setBackground(new Color(255,0,0,100));
				}
			}
			if(columna < 7) {
				if(botones[fila + 1][columna + 1].getOcupada() && botones[fila + 1][columna + 1].getPieza().getBando().equals("blancas")){
					disponibles.add(botones[fila + 1][columna + 1]);
					botones[fila + 1][columna + 1].getButton().setBackground(new Color(255,0,0,100));
				}
			}
		}
		
		return disponibles;
	}
}
