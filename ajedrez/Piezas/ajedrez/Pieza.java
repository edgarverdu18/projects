package ajedrez;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Pieza extends JLabel{

	private Icon icon;
	public Pieza() {
		this.icon = new ImageIcon("Images/reyB.png");
	}
	
	public Icon getIcon() { return icon;}
	private static final long serialVersionUID = 1L;
	
	
	
}
