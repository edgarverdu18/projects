package ajedrez;

import javax.swing.ImageIcon;

public class Peon extends Pieza {
	private static final long serialVersionUID = 1L;

	public Peon(String bando) {
		super();
		String nombre = "Images/" + bando + "/peon.png";
		this.icon = new ImageIcon(nombre);
	}
}
