package ajedrez;

import javax.swing.Icon;
import javax.swing.JButton;

public class ButtonIndex {
	private JButton button;
	private int indexRow;
	private int indexColumn;
	private boolean ocupada;
	private Pieza pieza;
	
	public ButtonIndex(JButton button, int indexRow, int indexColumn) {
		this.button = button;
		this.indexColumn = indexColumn;
		this.indexRow = indexRow;
		this.ocupada = false;
		this.pieza = null;
	}
	
	public int getRow() { return indexRow;}
	public int getColumn() { return indexColumn;}
	public JButton getButton() { return button;}
	public boolean getOcupada() { return ocupada;}
	public void setOcupada(boolean b) { ocupada = b;}
	public Pieza getPieza() { return pieza;}
	public void setPieza(Pieza p) { 
		pieza = p;
		this.getButton().setIcon(this.getIcon());
		this.setOcupada(true);
	}
	public Icon getIcon() {
		if(pieza == null)
			return null;
		else
			return pieza.getIcon();
	}

}
