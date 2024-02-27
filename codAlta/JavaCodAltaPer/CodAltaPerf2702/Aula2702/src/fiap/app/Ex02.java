package fiap.app;

import java.util.Scanner;

public class Ex02 {

	public static Scanner le = new Scanner(System.in);

	public static void main(String[] args) {

		final int N = 30;

		int n;
		do {
			System.out.print("Informe quantidade de alunos da sala (maximo " + N + "): ");
			n = le.nextInt();
		} while (n <= 0 || n > 30);
		int rm[] = new int[n];
		double nota1[] = new double[n];
		double nota2[] = new double[n];
		double media[] = new double[n];

		entradaDados(n, rm, nota1, nota2);
		calculaMedia(n, nota1, nota2, media);
		System.out.println("*** RMs e medias dos alunos da sala ***");
		for (int i = 0; i < n; i++)
			System.out.println("RM: " + rm[i] + "\t media: " + media[i]);

		int aprovados[] = new int[n];
		int nAp = geraListaAprovados(n, media, rm, aprovados);
		System.out.println("\n*** Alunos Aprovados***");
		for (int i = 0; i < nAp; i++)
			System.out.println(aprovados[i]);

	}

	public static void entradaDados(int n, int rm[], double nota1[], double nota2[]) {

		for (int i = 0; i < n; i++) {
			System.out.print(" RM: ");
			rm[i] = le.nextInt();
			System.out.print("  nota1: ");
			nota1[i] = le.nextDouble();
			System.out.print("  nota2: ");
			nota2[i] = le.nextDouble();
		}
	}

	public static void calculaMedia(int n, double nota1[], double nota2[], double media[]) {
		for (int i = 0; i < n; i++) {
			media[i] = (nota1[i] + nota2[i]) / 2;
		}

	}

	public static int geraListaAprovados(int n, double media[], int rm[], int aprovados[]) {
		int nAp = 0;
		for (int i = 0; i < n; i++) {
			if (media[i] >= 6) {
				aprovados[nAp] = rm[i];
				nAp++;
			}
		}
		return nAp;
	}

}