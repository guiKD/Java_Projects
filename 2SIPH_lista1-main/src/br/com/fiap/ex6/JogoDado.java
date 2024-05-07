package br.com.fiap.ex6;

public class JogoDado {
	
	public static void main(String[] args) {
		
		Dado um = new Dado();
		Dado dois = new Dado();
		
		int pontosA = 0;
		int pontosB = 0;
		
		while (pontosA < 100 && pontosB < 100) {
			int valor = um.lancar() + dois.lancar();
			pontosA = pontosA + valor;
		
			valor = um.lancar() + dois.lancar();
			pontosB = pontosB + valor;
		}
		
		System.out.println("Jogo A " + pontosA);
		System.out.println("Jogo B " + pontosB);
		
	}

}
