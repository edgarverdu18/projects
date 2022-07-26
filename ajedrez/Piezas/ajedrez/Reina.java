package ajedrez;

import javax.swing.ImageIcon;

public class Reina extends Pieza {
	private static final long serialVersionUID = 1L;

	public Reina(String bando) {
		super();
		String nombre = bando + "/reina.png";
		this.icon = new ImageIcon(nombre);
	}
}
