package ajedrez;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Pieza extends JLabel{

	protected Icon icon;
	protected boolean activa;
	public Pieza() {
		this.activa = true;
	}
	
	public Icon getIcon() { return icon;}
	private static final long serialVersionUID = 1L;
	
	
	
}
