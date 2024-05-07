package exercicio1;

import java.util.Scanner;

import filas.FilaInt;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		
		FilaInt fila = new FilaInt();
		fila.init();
		int valor;
		System.out.print("Digite valor inteiro positivo para inserir na fila (negativo para sair): ");
		valor = le.nextInt();
		while (valor >=0) {
			fila.enqueue(valor);
			System.out.print("Digite valor inteiro positivo para inserir na fila (negativo para sair): ");
			valor = le.nextInt();
		}
		while(!fila.isEmpty())
			System.out.println("Valor retirado: " + fila.dequeue());
		le.close();

	}

}
