package br.com.fiap.ex6;

public class TesteDado {
	
	public static void main(String[] args) {
		
		Dado azul = new Dado();
		Dado vermelho = new Dado();
		
		for (int i = 0; i < 10; i++)
			System.out.println(azul.lancar() + " " + vermelho.lancar());
		
	}

}
