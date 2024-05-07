package br.com.fiap.app;

import java.util.Random;

import br.com.fiap.model.Partida;
import br.com.fiap.model.Time;

public class Aplicacao {

	public static void main(String[] args) {
		Time sp = new Time();
		sp.setNome("São Paulo");
		
		Time cor = new Time();
		cor.setNome("Corinthians");
		
		Time pal = new Time();
		pal.setNome("Palmeira");
		
		Time juv = new Time();
		juv.setNome("Juventus");
		
		Random rand = new Random();

		int gV = rand.nextInt(10);
		int gC = rand.nextInt(10);
		Partida p1 = new Partida(sp, cor, gC, gV);
				
		gV = rand.nextInt(10);
		gC = rand.nextInt(10);
		Partida p2 = new Partida(sp, pal, gC, gV);
		
		gV = rand.nextInt(10);
		gC = rand.nextInt(10);
		Partida p3 = new Partida(sp, juv, gC, gV);
		
		gV = rand.nextInt(10);
		gC = rand.nextInt(10);
		Partida p4 = new Partida(cor, pal, gC, gV);

		gV = rand.nextInt(10);
		gC = rand.nextInt(10);
		Partida p5 = new Partida(cor, juv, gC, gV);

		gV = rand.nextInt(10);
		gC = rand.nextInt(10);
		Partida p6 = new Partida(juv, pal, gC, gV);

		System.out.println(sp.getNome() + " " + sp.getPontos());
		System.out.println(cor.getNome() + " " + cor.getPontos());
		System.out.println(pal.getNome() + " " + pal.getPontos());
		System.out.println(juv.getNome() + " " + juv.getPontos());
	}

}
