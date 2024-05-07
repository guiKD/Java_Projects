package br.com.fiap.ex6;

import java.util.Random;

public class Dado {
	
	private Random rand;
	
	
	public Dado() {
		rand = new Random();
	}
	
	public int lancar() {
		return rand.nextInt(6) + 1;
	}

}
