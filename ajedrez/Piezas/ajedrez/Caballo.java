package ajedrez;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Caballo extends Pieza {
	private static final long serialVersionUID = 1L;

	public Caballo(String bando) {
		super();
		super.bando  = bando;
		String nombre = "Images/" + bando + "/caballo.png";
		this.icon = new ImageIcon(nombre);
	}

	@Override
	public ArrayList<ButtonIndex> posDisponibles(ButtonIndex posicion, ButtonIndex[][] botones) {
		// TODO Auto-generated method stub
		return null;
	}
}
