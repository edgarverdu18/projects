package ajedrez;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.JButton;

public class ButtonIndex {
	private JButton button;
	private int indexRow;
	private int indexColumn;
	private Color color;
	private boolean ocupada;
	private Pieza pieza;
	
	public ButtonIndex(JButton button, int indexRow, int indexColumn, Color color) {
		this.button = button;
		this.indexColumn = indexColumn;
		this.indexRow = indexRow;
		this.color = color;
		this.ocupada = false;
		this.pieza = null;
	}
	
	public int getRow() { return indexRow;}
	public int getColumn() { return indexColumn;}
	public Color getColor() { return color;}
	public JButton getButton() { return button;}
	public boolean getOcupada() { return ocupada;}
	public void setOcupada(boolean b) { ocupada = b;}
	public Pieza getPieza() { return pieza;}
	public void setPieza(Pieza p) { 
		pieza = p;
		this.getButton().setIcon(this.getIcon());
		this.setOcupada(true);
	}
	public void quitarPieza() {
		this.pieza = null;
		ocupada = false;
		this.getButton().setIcon(null);
	}
	public Icon getIcon() {
		if(pieza == null)
			return null;
		else
			return pieza.getIcon();
	}
}
