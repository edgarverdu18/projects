package ajedrez;

import java.util.ArrayList;
import java.util.Vector;

public class Player {
	private String bando;
	private int numPiezas;
	private Alfil alfil1;
	private Alfil alfil2;
	private Torre torre1;
	private Torre torre2;
	private Rey rey;
	private Reina reina;
	private Caballo caballo1;
	private Caballo caballo2;
	private Peon peon1;
	private Peon peon2;
	private Peon peon3;
	private Peon peon4;
	private Peon peon5;
	private Peon peon6;
	private Peon peon7;
	private Peon peon8;
	
	public Player(String bando) {
		this.bando = bando;
		alfil1 = new Alfil(bando);
		alfil2 = new Alfil(bando);
		torre1 = new Torre(bando);
		torre2 = new Torre(bando);
		rey = new Rey(bando);
		reina = new Reina(bando);
		caballo1 = new Caballo(bando);
		caballo2 = new Caballo(bando);
		peon1 = new Peon(bando);
		peon2 = new Peon(bando);
		peon3 = new Peon(bando);
		peon4 = new Peon(bando);
		peon5 = new Peon(bando);
		peon6 = new Peon(bando);
		peon7 = new Peon(bando);
		peon8 = new Peon(bando);
		numPiezas = 16;
	}
	
	public Alfil getAlfil1() {
		return alfil1;
	}

	public Alfil getAlfil2() {
		return alfil2;
	}

	public Torre getTorre1() {
		return torre1;
	}

	public Torre getTorre2() {
		return torre2;
	}

	public Rey getRey() {
		return rey;
	}

	public Reina getReina() {
		return reina;
	}

	public Caballo getCaballo1() {
		return caballo1;
	}

	public Caballo getCaballo2() {
		return caballo2;
	}

	public Peon getPeon1() {
		return peon1;
	}

	public Peon getPeon2() {
		return peon2;
	}

	public Peon getPeon3() {
		return peon3;
	}

	public Peon getPeon4() {
		return peon4;
	}

	public Peon getPeon5() {
		return peon5;
	}

	public Peon getPeon6() {
		return peon6;
	}

	public Peon getPeon7() {
		return peon7;
	}

	public Peon getPeon8() {
		return peon8;
	}

	public int getNumPiezas() {
		return numPiezas;
	}
	
	public void reducePiezas() {
		numPiezas--;
	}
	
	public void aumentaPiezas() {
		numPiezas++;
	}
	
	public String getBando() {
		return bando;
	}
}
