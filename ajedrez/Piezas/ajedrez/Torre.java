package ajedrez;

import javax.swing.ImageIcon;

public class Torre extends Pieza {
	private static final long serialVersionUID = 1L;

	public Torre(String bando) {
		super();
		String nombre = "Images/" + bando + "/torre.png";
		this.icon = new ImageIcon(nombre);
	}
}
