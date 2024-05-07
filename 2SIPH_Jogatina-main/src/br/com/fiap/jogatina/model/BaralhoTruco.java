package br.com.fiap.jogatina.model;

public class BaralhoTruco extends Baralho {

	public BaralhoTruco() {

		this.monte = new Carta[40];
		this.topo = 39;

		int j = 0;
		for(int i = 1; i <= 13; i++) {
			if (i < 8 || i > 10) {
				monte[j++] = new Carta(i, Naipe.ESPADAS);
				monte[j++] = new Carta(i, Naipe.OUROS);
				monte[j++] = new Carta(i, Naipe.COPAS);
				monte[j++] = new Carta(i, Naipe.PAUS);
			}
		}
	}

}
