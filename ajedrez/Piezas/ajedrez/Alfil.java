package ajedrez;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Alfil extends Pieza {
	private static final long serialVersionUID = 1L;

	public Alfil(String bando) {
		super();
		super.bando  = bando;
		String nombre = "Images/" + bando + "/alfil.png";
		this.icon = new ImageIcon(nombre);
	}
	
	@Override
	public ArrayList<ButtonIndex> posDisponibles(ButtonIndex posicion, ButtonIndex[][] botones){
		ArrayList<ButtonIndex> posiciones = new ArrayList<ButtonIndex>();
		
		int fila = posicion.getRow(), columna = posicion.getColumn();
		while(fila - 1 >= 0 && columna - 1 >= 0){
			fila -= 1; columna -= 1;
			if(botones[fila][columna].getOcupada()) {
				if(botones[fila][columna].getPieza().getBando().equals(this.bando)) {
					break;
				}else {
					posiciones.add(botones[fila][columna]);
					break;
				}
			}else
				posiciones.add(botones[fila][columna]);
		}
		fila = posicion.getRow(); columna = posicion.getColumn();
		while(fila - 1 >= 0 && columna + 1 <= 7){
			fila -= 1; columna += 1;
			if(botones[fila][columna].getOcupada()) {
				if(botones[fila][columna].getPieza().getBando().equals(this.bando)) {
					break;
				}else {
					posiciones.add(botones[fila][columna]);
					break;
				}
			}else
				posiciones.add(botones[fila][columna]);
		}
		fila = posicion.getRow(); columna = posicion.getColumn();
		while(fila + 1 <= 7 && columna - 1 >= 0) {
			fila += 1; columna -= 1;
			if(botones[fila][columna].getOcupada()) {
				if(botones[fila][columna].getPieza().getBando().equals(this.bando)) {
					break;
				}else {
					posiciones.add(botones[fila][columna]);
					break;
				}
			}else
				posiciones.add(botones[fila][columna]);
		}
		fila = posicion.getRow(); columna = posicion.getColumn();
		while(fila + 1 <= 7 && columna + 1 <= 7) {
			fila += 1; columna += 1;
			if(botones[fila][columna].getOcupada()) {
				if(botones[fila][columna].getPieza().getBando().equals(this.bando)) {
					break;
				}else {
					posiciones.add(botones[fila][columna]);
					break;
				}
			}else
				posiciones.add(botones[fila][columna]);
		}
		
		return posiciones;
	}
}
