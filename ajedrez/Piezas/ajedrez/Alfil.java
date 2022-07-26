package ajedrez;

import javax.swing.ImageIcon;

public class Alfil extends Pieza {
	private static final long serialVersionUID = 1L;

	public Alfil(String bando) {
		super();
		super.bando  = bando;
		String nombre = "Images/" + bando + "/alfil.png";
		this.icon = new ImageIcon(nombre);
	}
}
