package ajedrez;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Reina extends Pieza {
	private static final long serialVersionUID = 1L;

	public Reina(String bando) {
		super();
		super.bando  = bando;
		String nombre = "Images/" + bando + "/reina.png";
		this.icon = new ImageIcon(nombre);
	}

	@Override
	public ArrayList<ButtonIndex> posDisponibles(ButtonIndex posicion, ButtonIndex[][] botones) {
		ArrayList<ButtonIndex> disponibles = new ArrayList<ButtonIndex>();
		int fila = posicion.getRow(), columna = posicion.getColumn();
		int suma = fila + columna, resta = fila - columna;
		
		AbajoDer:
		for(int i = fila; i <= 7; i++) {
			for(int j = columna; j <= 7; j++) {
				if((i - j == resta || i == fila)  && (i != fila || j != columna)) {
					ButtonIndex candidato = botones[i][j];
					if(candidato.getOcupada()) {
						if(!candidato.getPieza().getBando().equals(this.getBando())) {
							disponibles.add(candidato);
							candidato.getButton().setBackground(new Color(255,0,0,100));
						}
						if(i == fila)
							break;
						else
							break AbajoDer;
					}else {
						disponibles.add(candidato);
						candidato.getButton().setBackground(new Color(0,255,0,100));
					}
				}
			}
		}
		
		AbajoIzq:
			for(int j = fila; j <= 7; j++) {
				for(int i = columna; i >= 0; i--) {
					if((i + j == suma || j == columna) && (i != fila || j != columna)) {
						ButtonIndex candidato = botones[i][j];
						if(candidato.getOcupada()) {
							if(!candidato.getPieza().getBando().equals(this.getBando())) {
								disponibles.add(candidato);
								candidato.getButton().setBackground(new Color(255,0,0,100));
							}
							if(j == columna)
								break;
							else
								break AbajoIzq;
						}else {
							disponibles.add(candidato);
							candidato.getButton().setBackground(new Color(0,255,0,100));
						}
					}
				}
			}
		
		ArribaDer:
			for(int j = fila; j >= 0; j--) {
				for(int i = columna; i <= 7; i++) {
					if((i + j == suma || j == columna) && (i != fila || j != columna)) {
						ButtonIndex candidato = botones[i][j];
						if(candidato.getOcupada()) {
							if(!candidato.getPieza().getBando().equals(this.getBando())) {
								disponibles.add(candidato);
								candidato.getButton().setBackground(new Color(255,0,0,100));
							}
							if(j == columna)
								break;
							else
								break ArribaDer;
						}else {
							disponibles.add(candidato);
							candidato.getButton().setBackground(new Color(0,255,0,100));
						}
					}
				}
			}
		
		ArribaIzq:
			for(int i = fila; i >= 0; i--) {
				for(int j = columna; j >= 0; j--) {
					if((i - j == resta || i == fila) && (i != fila || j != columna)) {
						ButtonIndex candidato = botones[i][j];
						if(candidato.getOcupada()) {
							if(!candidato.getPieza().getBando().equals(this.getBando())) {
								disponibles.add(candidato);
								candidato.getButton().setBackground(new Color(255,0,0,100));
							}
							if(i == fila)
								break;
							else
								break ArribaIzq;
						}else {
							disponibles.add(candidato);
							candidato.getButton().setBackground(new Color(0,255,0,100));
						}
					}
				}
			}
		
		return disponibles;
	}
}
