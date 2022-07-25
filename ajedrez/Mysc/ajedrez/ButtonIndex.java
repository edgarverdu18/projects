package ajedrez;

import javax.swing.JButton;

public class ButtonIndex {
	private JButton button;
	private int indexRow;
	private int indexColumn;
	
	public ButtonIndex(JButton button, int indexRow, int indexColumn) {
		this.button = button;
		this.indexColumn = indexColumn;
		this.indexRow = indexRow;
	}
	
	public int getRow() { return indexRow;}
	public int getColumn() { return indexColumn;}
	public JButton getButton() { return button;}

}
