package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);

		final int N = 30;
		
		int n;
		do {
			System.out.print("Informe quantidade de alunos da sala (maximo " + N + "): ");
			n = le.nextInt();
		} while (n<=0 || n > 30);
		int rm[] = new int[n];
		double nota1[] = new double[n];
		double nota2[] = new double[n];
		double media[] = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print(" RM: ");
			rm[i] = le.nextInt();
			System.out.print("  nota1: ");
			nota1[i] = le.nextDouble();
			System.out.print("  nota2: ");
			nota2[i] = le.nextDouble();
			media[i] = (nota1[i] + nota2[i]) / 2;
		}

		System.out.println("*** RMs e medias dos alunos da sala ***");
		for (int i = 0; i < n; i++)
			System.out.println("RM: " + rm[i] + "\t media: " + media[i]);

		int nAp=0;
		int aprovados[]= new int[n];
		for(int i=0; i<n; i++) {
			if (media[i]>=6) {
				aprovados[nAp] = rm[i];
				nAp++;
			}
		}
		System.out.println("\n*** Alunos Aprovados***");
		for(int i=0;i<nAp;i++) 
			System.out.println(aprovados[i]);
		
		
		
		le.close();

	}

}
