package teste;

import java.util.Scanner;

import listas.ListaCrescenteInt;

public class MainTeste {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ListaCrescenteInt lista = new ListaCrescenteInt();
		int valor;
		System.out.print("Valor positivo insere na lista, negativo encerra: ");
		valor = le.nextInt();
		while (valor >=0) {
			lista.add(valor);
			lista.show();
			System.out.print("Valor positivo insere na lista, negativo encerra: ");
			valor = le.nextInt();
		}
		le.close();
	}

}
