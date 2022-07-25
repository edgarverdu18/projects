package ajedrez;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Board implements ActionListener{
	
	JFrame frame;
	JPanel panel;

	public Board() {
		panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.green, 10), BorderFactory.createLineBorder(Color.blue, 5)));
		panel.setLayout(new GridLayout(8, 8));
		
		ButtonIndex[][] botones = new ButtonIndex[8][8];
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				JButton button = new JButton();
				if((i+j) % 2 == 0) {
					button.setBackground(Color.white);
				}else {
					button.setBackground(Color.black);
				}
				panel.add(button);
				botones[i][j] = new ButtonIndex(button,i,j);
			}
		}
		
		frame = new JFrame();
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(1000, 1000);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
