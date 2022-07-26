package ajedrez;

import javax.swing.ImageIcon;

public class Rey extends Pieza {
	private static final long serialVersionUID = 1L;

	public Rey(String bando) {
		super();
		String nombre = bando + "/rey.png";
		this.icon = new ImageIcon(nombre);
	}
}
