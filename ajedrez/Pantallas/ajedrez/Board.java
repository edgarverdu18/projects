package ajedrez;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Board implements ActionListener{
	
	JFrame frame;
	JPanel panel;
	ButtonIndex[][] botones = new ButtonIndex[8][8];
	Player player1;
	Player player2;
	int jugador;
	boolean mov;
	ButtonIndex botonAMover;
	ArrayList<ButtonIndex> disponibles;

	public Board() {
		player1 = new Player("blancas");
		player2 = new Player("negras");
		jugador = 1;
		disponibles = new ArrayList<ButtonIndex>();
		mov = false;
		
		panel = new JPanel();
		panel.setBackground(Color.lightGray);
		panel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.green, 10), BorderFactory.createLineBorder(Color.blue, 5)));
		panel.setLayout(new GridLayout(8, 8));
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				JButton button = new JButton();
				if((i+j) % 2 == 0) {
					button.setBackground(Color.white);
				}else {
					button.setBackground(Color.black);
				}
				botones[i][j] = new ButtonIndex(button,i,j, button.getBackground());
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
		botones[0][0].setPieza(player2.getTorre1());
		botones[0][1].setPieza(player2.getCaballo1());
		botones[0][2].setPieza(player2.getAlfil1());
		botones[0][3].setPieza(player2.getReina());
		botones[0][4].setPieza(player2.getRey());
		botones[0][5].setPieza(player2.getAlfil2());
		botones[0][6].setPieza(player2.getCaballo2());
		botones[0][7].setPieza(player2.getTorre2());
		for(int i = 0; i < 8; i++) {
			botones[1][i].setPieza(player2.getPeon1());
		}

		botones[7][0].setPieza(player1.getTorre1());
		botones[7][1].setPieza(player1.getCaballo1());
		botones[7][2].setPieza(player1.getAlfil1());
		botones[7][3].setPieza(player1.getReina());
		botones[7][4].setPieza(player1.getRey());
		botones[7][5].setPieza(player1.getAlfil2());
		botones[7][6].setPieza(player1.getCaballo2());
		botones[7][7].setPieza(player1.getTorre2());
		
		for(int i = 0; i < 8; i++) {
			botones[6][i].setPieza(player1.getPeon1());
		}
		botones[5][1].setPieza(player2.getTorre1());
		botones[5][0].setPieza(player2.getAlfil1());
		botones[5][3].setPieza(player1.getTorre1());

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				if(botones[i][j].getButton().equals(button)) {
					if(!mov) {
						if(botones[i][j].getOcupada()) {
							if(jugador == 1 && botones[i][j].getPieza().getBando().equals("blancas")) {
								rePrint();
								disponibles = botones[i][j].getPieza().posDisponibles(botones[i][j], botones);
								mov = true;
								botonAMover = botones[i][j];
							}else if(jugador == 2 && botones[i][j].getPieza().getBando().equals("negras")) {
								rePrint();
								disponibles = botones[i][j].getPieza().posDisponibles(botones[i][j], botones);
								mov = true;
								botonAMover = botones[i][j];
							}
						}
					}else {
						if(disponibles.contains(botones[i][j])) {
							botones[i][j].setPieza(botonAMover.getPieza());
							botonAMover.quitarPieza();
							rePrint();
							mov = false;
							if(jugador == 1)
								jugador = 2;
							else
								jugador = 1;
						}
					}
				}
			}
		}	
	}
	
	public void rePrint() {
		if(!disponibles.isEmpty()) {
			for(ButtonIndex b : disponibles) {
				b.getButton().setBackground(b.getColor());
			}
			disponibles.clear();
		}
	}

}
