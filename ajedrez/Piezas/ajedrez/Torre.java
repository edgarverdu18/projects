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
		// TODO Auto-generated method stub
		return null;
	}
}
