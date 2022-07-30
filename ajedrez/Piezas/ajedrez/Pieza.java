package ajedrez;

import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.JLabel;

public abstract class Pieza extends JLabel{

	protected Icon icon;
	protected boolean activa;
	protected String bando;
	public Pieza() {
		this.activa = true;
	}
	
	public Icon getIcon() { return icon;}
	public String getBando() { return bando;}
	public abstract ArrayList<ButtonIndex> posDisponibles(ButtonIndex posicion, ButtonIndex[][] botones);
	private static final long serialVersionUID = 1L;
	
	
	
}
