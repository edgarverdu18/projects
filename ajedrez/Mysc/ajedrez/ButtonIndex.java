package ajedrez;

import javax.swing.JButton;

public class ButtonIndex {
	private JButton button;
	private int indexRow;
	private int indexColumn;
	private boolean ocupada;
	
	public ButtonIndex(JButton button, int indexRow, int indexColumn) {
		this.button = button;
		this.indexColumn = indexColumn;
		this.indexRow = indexRow;
		this.ocupada = false;
	}
	
	public int getRow() { return indexRow;}
	public int getColumn() { return indexColumn;}
	public JButton getButton() { return button;}
	public boolean getOcupada() { return ocupada;}

}
