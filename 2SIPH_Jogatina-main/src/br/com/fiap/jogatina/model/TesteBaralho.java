package br.com.fiap.jogatina.model;

public class TesteBaralho {

	public static void main(String[] args) {
		Baralho maco = new Baralho();
		
		maco.embaralhar();
		
		//maco.imprime();
		
		BaralhoTruco b = new BaralhoTruco();
		b.embaralhar();
		b.imprime();
		
	}
	
}
