package br.com.fiap.jogatina.app;

import br.com.fiap.jogatina.model.Carta;

public class JogadorCpu extends Jogador {
	
	public JogadorCpu(Carta c1, Carta c2) {
		super(c1, c2);
	}
	
	public boolean querCarta() {
		if(getPontos() > 16)
			return false;
		else
			return true;
	}
}
