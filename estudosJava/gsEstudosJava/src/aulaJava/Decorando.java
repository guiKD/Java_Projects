package aulaJava;

// CRTL + SHIFT + O
import java.util.Scanner;

public class Decorando {
	
	//Criação do vetor global contendo os nomes do pilotos
	public static String[] pilotos = {"Daniel Ricciardo", "Kimi Raikkonen", "Lewis Hamilton", "Nico Rorberg", "Sebastian Vettel"};

	public static void main(String[] args) {
		
		//Criação do vetor na main contendo os países dos Gp's
		String[] paises = {"Bélgica", "Itália", "Cingapura", "Malásia", "Japão"};
		
		// A)
		//Chamar o método Relatório Gerencial na Main
		relatorioGerencial(paises);
	}
	
	    //Criação de um método Relatório Gerencial que recebe como parâmetro o vetor com o nome dos países
		public static void relatorioGerencial (String [] paises) {
			
		//Exibir o retorno do método de entrada do usuário referente à pontuação dos pilotos por GP
			int [][] pontos = atribuirPontuacao(paises);
			
		//Exibir a soma da pontuação total de cada piloto em todos os GP´S
			int [] pontosPorPiloto = somarPontuacao(pontos);
			
		//Imprimir a pontuação total de cada piloto
			System.out.println("Pontuação dos pilotos:");
			for(int i=0; i<5; i++)
			System.out.println(pilotos[i] + ": " + pontosPorPiloto[i]);
			
		//Exibir o vencedor de cada GP
			int [] vencedor = identificarVencedorPorGP(pontos);
			
		//Imprimir os vencedores por GP
			System.out.println("Vencedor por GP: ");
			for(int i=0; i<5; i++)
			System.out.println("GP de " + paises[i] + ": " + pilotos[vencedor[i]]);

			// Indentifica e imprime o vencedor geral
			identificarVencedorGeral(pontos);
	}
		
		// B)
		//Criação de um método para entrada de dados referente à pontuação do piloto por GP,
		//o método recebe como parâmetro o vetor carregando o nome dos países
		public static int[][] atribuirPontuacao (String [] paises){
			
			//Matriz
			int [][] pontos = new int [5][5];
			Scanner entrada = new Scanner(System.in);
			
			//Para cada país
			for(int i=0; i<5; i++) {
				System.out.println("GP de " + paises[i] + ". Insira as pontuações:");
				
			//Entrada do usuário colocando a pontuação dos pilotos por GP
			for(int j=0; j<5; j++) {
				System.out.println(pilotos[j] + ":");
				pontos[i][j] = entrada.nextInt();			
			}
			
			
			
		}
			
			System.out.println("---------------");
			//Retorno da matriz
			return pontos; 
			
	}
		
		// C)
		//Criação de um método para verificar a pontuação total de cada piloto, 
		//recebendo como parâmetro a matriz pontos
		public static int [] somarPontuacao (int [][] pontos) {
			
			//determinar os pontos dos pilotos para depois somá-los
			int[] pontosPorPiloto = {0, 0, 0, 0, 0};
			
			//Para cada país
			for(int i=0; i<5; i++) {
				
			//Soma a pontuação de cada piloto
			for(int j=0; j<5; j++) {
					
			//Soma do total de cada piloto em todos os GP´S
			pontosPorPiloto[j] += pontos[i][j];
					
				}
			
			
			
			}
			
			System.out.println("---------------");
			return pontosPorPiloto;
			
		}
		
		// D)
		//Criação de um método que estipula o vencedor de cada GP
		public static int [] identificarVencedorPorGP (int [][] pontos) {
			
			int[] vencedor = new int[5];
			
			//Para cada país
			for(int i=0; i<5; i++) {
				
			//Declarando o índice para a variável vencedor
			vencedor[i] = 0;
			
			//Verificando em cada piloto
			for(int j=1; j<5; j++) {
				
			// Se o piloto da posição j tiver mais pontos que o piloto
			// da posicao armazenada em vencedor[i]
			if(pontos[i][j] > pontos[i][vencedor[i]]) {
				
			//Troca o índice do piloto com mais pontos
			vencedor[i] = j;
				
			}
			
			
			
		}
			
			
			
	}
			
			System.out.println("---------------");
			// Retorna o vetor com os vencedores
			return vencedor;
			
	}
		
		// Recebe a matriz de pontuação de cada piloto por pais,
		// determina qual o piloto com mais pontos (vencedor) considerando
		// os 5 GPs. Imprime o nome do piloto vencedor
		public static void identificarVencedorGeral(int[][] pontos) {
			
			// Determina a pontuação total por piloto
			int[] pontosPorPiloto = somarPontuacao(pontos);
					
			int vencedor = 0; // Supõe que o vencedor está o indice 0
					
			// Percorre os outros pilotos
			for(int i = 1; i < 5; i++)
				
			// Se o piloto no indice i possuir mais pontos que o vencedor atual
			if(pontosPorPiloto[i] > pontosPorPiloto[vencedor])
							vencedor = i; // Atualiza o indice do vencedor
					
			// Imprime o piloto vencedor
			System.out.println("Vencedor da temporada: " + pilotos[vencedor]);
			
		}
}

// Dúvida 1: Quando usar public static void ou public static int? 
// Qual a diferença entre eles? -> O public static int retorna um valor do tipo “int”
// Já o public static void não retorna nada, isto é, quando pedir retorno use public static int
// e quando não pedir retorno use public static void
