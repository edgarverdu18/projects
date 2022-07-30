package ajedrez;

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

		
		
		return disponibles;
	}
}
