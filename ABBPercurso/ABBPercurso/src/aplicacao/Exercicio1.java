package aplicacao;

import java.util.Scanner;

import arvore.ABBINT;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ABBINT abb = new ABBINT();
		int opcao;
		do {
			System.out.println("0-SAIR");
			System.out.println("1-INSERIR");
			System.out.println("2-APRESENTAR ABB");
			opcao = le.nextInt();
			switch(opcao) {
			case 0:
				System.out.println("Encerrando o programa!");
				break;
			case 1:
				System.out.println("Valor a ser inserido: ");
				int valor = le.nextInt();
				abb.root = abb.inserir(abb.root,valor);
				break;
			case 2:
				System.out.println("\n *** Apresentacao da ABB em ordem crescente ***");
				abb.show(abb.root);
				System.out.println("\n");
				break;
				default:
					System.out.println("Opcao invalida");
			}
		}while (opcao != 0);
		le.close();
	}
}
