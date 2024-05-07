package br.com.fiap.jogatina.model;

public class Carta {

	private int valor;
	private Naipe naipe;
	
	public Carta(int valor, Naipe naipe) {
		//super();
		this.valor = valor;
		this.naipe = naipe;
	}

	public int getValor() {
		return valor;
	}

	public Naipe getNaipe() {
		return naipe;
	}	
	
	public String toString() {
		//return valor + "" + naipe;
		String vl = Integer.toString(valor);
		switch (valor) {
		case 1: 
			vl = "A";
			break;
		case 11:
			vl = "J";
			break;
		case 12:
			vl = "Q";
			break;
		case 13:
			vl = "K";
			break;
		}
		
		
		if (naipe == Naipe.OUROS)
			return vl + "♦";  //alt+4
		else if (naipe == Naipe.COPAS)
			return vl + "♥";  //alt+3
		else if (naipe == Naipe.ESPADAS)
			return vl + "♠";  //alt+6
		else
			return vl + "♣"; //alt+5
	}
	
}








