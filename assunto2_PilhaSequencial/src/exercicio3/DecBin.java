package exercicio3;

import java.util.Scanner;

import pilhas.PilhaInt;

public class DecBin {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		PilhaInt pilha = new PilhaInt();
		pilha.init();
		
		System.out.print("Informe valor decimal: ");
		int decimal = le.nextInt();
		int resto;
		while (decimal != 0) {
			resto = decimal % 2;
			pilha.push(resto);
			decimal = decimal / 2;
		}
		System.out.print("Binario: ");
		pilha.esvazia();
		
		le.close();

	}

}
