package ajedrez;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Rey extends Pieza {
	private static final long serialVersionUID = 1L;

	public Rey(String bando) {
		super();
		super.bando  = bando;
		String nombre = "Images/" + bando + "/rey.png";
		this.icon = new ImageIcon(nombre);
	}

	@Override
	public ArrayList<ButtonIndex> posDisponibles(ButtonIndex posicion, ButtonIndex[][] botones) {
		// TODO Auto-generated method stub
		return null;
	}
}
