package ajedrez;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class Board implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	ButtonIndex[][] botones = new ButtonIndex[8][8];
	Player player1;
	Player player2;

	public Board() {
		player1 = new Player("blancas");
		player2 = new Player("negras");
		
		panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.green, 10), BorderFactory.createLineBorder(Color.blue, 5)));
		panel.setLayout(new GridLayout(8, 8));
		
		//Pieza pieza = new Torre("Images/negras");
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				JButton button = new JButton();
				if((i+j) % 2 == 0) {
					button.setBackground(Color.white);
				}else {
					button.setBackground(Color.black);
				}
				botones[i][j] = new ButtonIndex(button,i,j);
				//botones[i][j].getButton().setIcon(pieza.getIcon());
				botones[i][j].getButton().addActionListener(this);
				panel.add(botones[i][j].getButton());
				
			}
		}
		
		this.InitPiezas();
		
		frame = new JFrame();
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(1000, 1000);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	

	public void InitPiezas() {
		botones[0][0].getButton().setIcon(player2.getTorre1().getIcon());
		botones[0][1].getButton().setIcon(player2.getCaballo1().getIcon());
		botones[0][2].getButton().setIcon(player2.getAlfil1().getIcon());
		botones[0][3].getButton().setIcon(player2.getReina().getIcon());
		botones[0][4].getButton().setIcon(player2.getRey().getIcon());
		botones[0][5].getButton().setIcon(player2.getAlfil2().getIcon());
		botones[0][6].getButton().setIcon(player2.getCaballo2().getIcon());
		botones[0][7].getButton().setIcon(player2.getTorre2().getIcon());
		for(int i = 0; i < 8; i++) {
			botones[1][i].getButton().setIcon(player2.getPeon1().getIcon());
		}

		botones[7][0].getButton().setIcon(player1.getTorre1().getIcon());
		botones[7][1].getButton().setIcon(player1.getCaballo1().getIcon());
		botones[7][2].getButton().setIcon(player1.getAlfil1().getIcon());
		botones[7][3].getButton().setIcon(player1.getReina().getIcon());
		botones[7][4].getButton().setIcon(player1.getRey().getIcon());
		botones[7][5].getButton().setIcon(player1.getAlfil2().getIcon());
		botones[7][6].getButton().setIcon(player1.getCaballo2().getIcon());
		botones[7][7].getButton().setIcon(player1.getTorre2().getIcon());
		for(int i = 0; i < 8; i++) {
			botones[6][i].getButton().setIcon(player1.getPeon1().getIcon());
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(botones[i][j].getButton().equals(button)) {
					botones[i][j].getButton().setIcon(null);
				}
			}
		}	
	}

}
