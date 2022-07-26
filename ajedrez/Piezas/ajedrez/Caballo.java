package ajedrez;

import javax.swing.ImageIcon;

public class Caballo extends Pieza {
	private static final long serialVersionUID = 1L;

	public Caballo(String bando) {
		super();
		String nombre = bando + "/caballo.png";
		this.icon = new ImageIcon(nombre);
	}
}
