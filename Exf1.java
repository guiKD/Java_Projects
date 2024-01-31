package ExF1;

import java.util.Scanner;

public class Exf1 {

	public static String[] pilotos = { "Daniel Ricciardo", "Kimi Raikkonen", "Lewis Hamilton", "Nico Rosberg",
			"Sebastian Vettel" };

	public static void main(String[] args) {

		String[] paises = { "Bélgica", "Itália", "Cingapura", "Malásia", "Japão" };

		relatorioGerencial(paises);

	}

	public static void relatorioGerencial(String[] paises) {

		int[][] pontos = atribuirPontuacao(paises);

		int[] pontosPorPiloto = somarPontuacao(pontos);

		System.out.println("");

		System.out.println("Pontuação dos pilotos: ");
		for (int i = 0; i < 5; i++)
			System.out.println(pilotos[i] + ":" + pontosPorPiloto[i]);

		System.out.println("");

		int[] vencedorGP = vencedorPorGP(pontos);

		System.out.println("Vencedores por GP: ");
		for (int i = 0; i < 5; i++)
			System.out.println("GP de " + paises[i] + ":" + pilotos[vencedorGP[i]]);
		
		System.out.println("");

		pilotoVencedor(pontos);

	}

	public static int[][] atribuirPontuacao(String[] paises) {

		Scanner entrada = new Scanner(System.in);
		int pontos[][] = new int[5][5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Gp de " + paises[i] + ". Insira as pontuações: ");

			for (int j = 0; j < 5; j++) {
				System.out.println(pilotos[j] + ": ");
				pontos[i][j] = entrada.nextInt();

			}

		}

		return pontos;

	}

	public static int[] somarPontuacao(int[][] pontos) {

		int[] pontosPorPiloto = { 0, 0, 0, 0, 0 };

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				pontosPorPiloto[j] += pontos[i][j];
			}
		}

		return pontosPorPiloto;

	}

	public static int[] vencedorPorGP(int[][] pontos) {

		int[] vencedorGP = new int[5];

		for (int i = 0; i < 5; i++) {

			vencedorGP[i] = 0;

			for (int j = 1; j < 5; j++) {

				if (pontos[i][j] > pontos[i][vencedorGP[i]])

				vencedorGP[i] = j;

			}
		}

		return vencedorGP;

	}

	public static void pilotoVencedor(int[][] pontos) {

		int[] pontosPorPiloto = somarPontuacao(pontos);

		int vencedor = 0;

		for (int i = 1; i < 5; i++)

			if (pontosPorPiloto[i] > pontosPorPiloto[vencedor])
				vencedor = i;

		System.out.println("Vencedor da temporada: " + pilotos[vencedor]);

	}

}
