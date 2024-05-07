package br.com.fiap.jogatina.model;

public class BaralhoTruco2 extends Baralho {

	@Override
	public Carta comprar() {
		Carta c = super.comprar();
		while (c.getValor() >= 8 && c.getValor() <= 10)
			c = super.comprar();
		
		return c;
	}
	
}
