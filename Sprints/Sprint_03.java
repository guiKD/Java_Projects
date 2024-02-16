package Codigos;
import java.util.Scanner;

public class Sprint_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //1)
        
        System.out.print("Digite a quantidade de equipes participantes: ");
        int quantidadeEquipes = entrada.nextInt();
        
        if (quantidadeEquipes < 1) {
            System.out.println("Quantidade de equipes inválida. Deve haver pelo menos uma equipe.");
            return;
        }
        
        int[] numerosEquipes = new int[quantidadeEquipes];
        int[] pontosEquipes = new int[quantidadeEquipes];
        double[] notasDesignEquipes = new double[quantidadeEquipes];

        for (int i = 0; i < quantidadeEquipes; i++) {
            int numeroEquipe;

            do {
                System.out.print("Digite o número da equipe " + (i + 1) + " (de 11 até 99): ");
                numeroEquipe = entrada.nextInt();
            } while (numeroEquipe < 11 || numeroEquipe > 99 || existeEquipeComNumero(numerosEquipes, numeroEquipe));

            numerosEquipes[i] = numeroEquipe;

           //2)
            System.out.print("Digite a quantidade de combates realizados pela equipe " + numeroEquipe + ": ");
            int quantidadeCombates = entrada.nextInt();

            int vitorias = 0;
            int empates = 0;

            for (int j = 0; j < quantidadeCombates; j++) {
                char resultado;
                do {
                    System.out.print("Resultado do combate " + (j + 1) + " para a equipe " + numeroEquipe +
                            " (V - Vitória, E - Empate, D - Derrota): ");
                    resultado = entrada.next().toUpperCase().charAt(0);
                } while (resultado != 'V' && resultado != 'E' && resultado != 'D');

                if (resultado == 'V') {
                    vitorias++;
                } else if (resultado == 'E') {
                    empates++;
                }
            }

            pontosEquipes[i] = (vitorias * 5) + (empates * 3);

           //3)
            
            do {
                System.out.print("Digite a nota de design para a equipe " + numeroEquipe + " (de 0 a 10): ");
                while (!entrada.hasNextDouble()) {
                    System.out.println("Por favor, insira uma nota válida.");
                    System.out.print("Digite a nota de design para a equipe " + numeroEquipe + " (de 0 a 10): ");
                    entrada.next();
                }
                notasDesignEquipes[i] = entrada.nextDouble();
            } while (notasDesignEquipes[i] < 0 || notasDesignEquipes[i] > 10);
        }

     //	4)   
     // Classificar equipes por pontos e em caso de empate por nota de design
        for (int i = 0; i < quantidadeEquipes; i++) {
            for (int j = i + 1; j < quantidadeEquipes; j++) {
                if (pontosEquipes[j] > pontosEquipes[i] || (pontosEquipes[j] == pontosEquipes[i] && notasDesignEquipes[j] > notasDesignEquipes[i])) {
                    // Trocar de posição
                    int tempNumero = numerosEquipes[i];
                    numerosEquipes[i] = numerosEquipes[j];
                    numerosEquipes[j] = tempNumero;

                    int tempPontos = pontosEquipes[i];
                    pontosEquipes[i] = pontosEquipes[j];
                    pontosEquipes[j] = tempPontos;

                    double tempNota = notasDesignEquipes[i];
                    notasDesignEquipes[i] = notasDesignEquipes[j];
                    notasDesignEquipes[j] = tempNota;
                }	
            }
        }

        // Imprimir lista de classificação
        System.out.println("-------------- Classificação final --------------");
        for (int i = 0; i < quantidadeEquipes; i++) {
            System.out.println((i + 1) + ". Equipe " + numerosEquipes[i] + " - Pontos: " + pontosEquipes[i] +
                    " - Nota de Design: " + notasDesignEquipes[i]);
        }

  
    }

    // Função para verificar se uma equipe com o mesmo número já existe no array
    public static boolean existeEquipeComNumero(int[] numerosEquipes, int numeroEquipe) {
        for (int numero : numerosEquipes) {
            if (numero == numeroEquipe) {
                return true;
            }
        }
        return false;
    }
}


