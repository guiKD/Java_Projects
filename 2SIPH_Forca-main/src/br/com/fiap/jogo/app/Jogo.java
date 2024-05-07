package br.com.fiap.jogo.app;

import java.util.Scanner;

import br.com.fiap.jogo.model.Forca;

public class Jogo {
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Forca f = new Forca();
		
		while (!f.enforcou() && !f.acertou()) {
			System.out.println(f.getPalavraFechada());
			System.out.print("Letra: ");
			char c = tec.nextLine().charAt(0);
			
			f.chuta(c);
		}
		
		if (f.enforcou()) {
			System.out.println("Perdeu: " + f.getPalavraAberta());
		}
		else
			System.out.println("Parabéns");
	}

}
