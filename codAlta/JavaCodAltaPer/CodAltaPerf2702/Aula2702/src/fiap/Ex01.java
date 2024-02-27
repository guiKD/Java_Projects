package fiap;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int N = 30;

		int n;

		do {

			System.out.println("Informe quantidade de alunos da sala (máximo " + N + "): ");
			n = entrada.nextInt();

		} while (n <= 0 || n > 30);

		int rm[] = new int[n];
		double nota1[] = new double[n];
		double nota2[] = new double[n];
		double media[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("RM: ");
			rm[i] = entrada.nextInt();
			System.out.println("Nota 1: ");
			nota1[i] = entrada.nextDouble();
			System.out.println("Nota 2: ");
			nota2[i] = entrada.nextDouble();
			media[i] = (nota1[i] + nota2[i]) / 2;
		}

		System.out.println("*** RMs e medias dos alunos da sala ***");
		for (int i = 0; i < n; i++) {
			System.out.println("RM: " + rm[i] + "\t media: " + media[i]);

		}

		int nAp = 0;
		int aprovados[] = new int[n];
		for (int i = 0; i < n; i++) {
			if (media[i] >= 6) {
				aprovados[nAp] = rm[i];
				nAp++;

			}
		}

		System.out.println("\n*** Alunos Aprovados ***");
		for (int i = 0; i < nAp; i++)
			System.out.println(aprovados[i]);

		entrada.close();

	}

}
