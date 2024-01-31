package Sprint;
import java.util.Scanner;

public class Sprint04 {
    // entrada global
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // Solicita a quantidade de equipes participantes
        System.out.print("Digite a quantidade de equipes participantes: ");
        int quantidadeEquipes = entrada.nextInt();

        // Verifica se a quantidade de equipes é válida
        if (quantidadeEquipes < 1) {
            System.out.println("Quantidade de equipes inválida. Deve haver pelo menos uma equipe.");
            return;
        }

        // Inicializa arrays para armazenar dados das equipes
        int[] numerosEquipes = new int[quantidadeEquipes];
        double[] notasDesignEquipes = new double[quantidadeEquipes];
        int[] pontosEquipes = new int[quantidadeEquipes];

        // Preenche informações sobre cada equipe
        for (int i = 0; i < quantidadeEquipes; i++) {
            int numeroDaEquipe = 0;
            do {
                System.out.print("Digite o número da equipe " + (i + 1) + " (de 11 até 99): ");
                numeroDaEquipe = entrada.nextInt();
            } while (numeroDaEquipe < 11 || numeroDaEquipe > 99 || existeEquipeComNumero(numerosEquipes, numeroDaEquipe));
            numerosEquipes[i] = numeroDaEquipe;

            // Pede e verifica a nota de design da equipe
            do {
                System.out.print("Digite a nota de design para a equipe " + numeroDaEquipe + " (de 0 a 10): ");
                while (!entrada.hasNextDouble()) {
                    System.out.println("Por favor, insira uma nota válida.");
                    System.out.print("Digite a nota de design para a equipe " + numeroDaEquipe + " (de 0 a 10): ");
                    entrada.next();
                }
                notasDesignEquipes[i] = entrada.nextDouble();
            } while (notasDesignEquipes[i] < 0 || notasDesignEquipes[i] > 10);
        }
        
        // Combates todos contra todos
        for (int i = 0; i < quantidadeEquipes; i++) {
            for (int j = i + 1; j < quantidadeEquipes; j++) {
                // Gera valores aleatórios para as equipes
                int valorEquipeA = (int) (Math.random() * 10) + 1;
                int valorEquipeB = (int) (Math.random() * 10) + 1;

                // Exibe informações sobre o confronto
                System.out.println("-------------------------");
                System.out.println("Confronto entre Equipe " + numerosEquipes[i] + " e Equipe " + numerosEquipes[j] + ":");
                System.out.println("Equipe " + numerosEquipes[i] + " - Valor gerado: " + valorEquipeA);
                System.out.println("Equipe " + numerosEquipes[j] + " - Valor gerado: " + valorEquipeB);

                // Determina o vencedor e atualiza os pontos
                int resultado = determinarVencedor(valorEquipeA, valorEquipeB, notasDesignEquipes[i], notasDesignEquipes[j]);
                if (resultado == 1) {
                    System.out.println("Vencedor: Equipe " + numerosEquipes[i]);
                    pontosEquipes[i] += 2; // 2 pontos para vitória
                } else if (resultado == 2) {
                    System.out.println("Vencedor: Equipe " + numerosEquipes[j]);
                    pontosEquipes[j] += 2; // 2 pontos para vitória
                } else {
                    System.out.println("Empate. Utilizando nota de design para desempate.");
                    if (notasDesignEquipes[i] > notasDesignEquipes[j]) {
                        System.out.println("Vencedor: Equipe " + numerosEquipes[i]);
                        pontosEquipes[i] += 1; // 1 ponto para empate
                    } else if (notasDesignEquipes[j] > notasDesignEquipes[i]) {
                        System.out.println("Vencedor: Equipe " + numerosEquipes[j]);
                        pontosEquipes[j] += 1; // 1 ponto para empate
                    } else {
                        System.out.println("Empate novamente. Nenhum ponto atribuído.");
                    }
                }
                System.out.println("-------------------------------------");
            }
        }

        // Determina as 3 melhores equipes
        ordenarEquipesPorPontosENota(pontosEquipes, notasDesignEquipes, numerosEquipes);

        // Imprime as 3 melhores equipes
        System.out.println("-------------- 3 Melhores Equipes --------------");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". Equipe " + numerosEquipes[i] + " - Pontos: " + pontosEquipes[i] + 
                    " - Nota de Design: " + notasDesignEquipes[i]);
        }

        // Fase Final entre as 3 melhores equipes
        System.out.println("-------------- Fase Final --------------");
        int[] equipesFinais = {numerosEquipes[0], numerosEquipes[1], numerosEquipes[2]};
        int[] pontosFinais = {0, 0, 0};
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                // Gera valores aleatórios para as equipes finais
                int valorEquipeA = (int) (Math.random() * 10) + 1;
                int valorEquipeB = (int) (Math.random() * 10) + 1;

                // Exibe informações sobre o confronto
                System.out.println("Confronto entre Equipe " + equipesFinais[i] + " e Equipe " + equipesFinais[j] + ":");
                System.out.println("Equipe " + equipesFinais[i] + " - Valor gerado: " + valorEquipeA);
                System.out.println("Equipe " + equipesFinais[j] + " - Valor gerado: " + valorEquipeB);

                // Determina o vencedor e atualiza os pontos
                int resultado = determinarVencedor(valorEquipeA, valorEquipeB, notasDesignEquipes[i], notasDesignEquipes[j]);
                if (resultado == 1) {
                    System.out.println("Vencedor: Equipe " + equipesFinais[i]);
                    pontosFinais[i] += 2; // 2 pontos para vitória
                } else if (resultado == 2) {
                    System.out.println("Vencedor: Equipe " + equipesFinais[j]);
                    pontosFinais[j] += 2; // 2 pontos para vitória
                } else {
                    System.out.println("Empate. Utilizando nota de design para desempate.");
                    if (notasDesignEquipes[i] > notasDesignEquipes[j]) {
                        System.out.println("Vencedor: Equipe " + equipesFinais[i]);
                        pontosFinais[i] += 1; // 1 ponto para empate
                    } else if (notasDesignEquipes[j] > notasDesignEquipes[i]) {
                        System.out.println("Vencedor: Equipe " + equipesFinais[j]);
                        pontosFinais[j] += 1; // 1 ponto para empate
                    } else {
                        System.out.println("Empate novamente. Nenhum ponto atribuído.");
                    }
                }
                System.out.println("--------------------------------");
            }
        }

        // Determina equipe vencedora da fase final
        int equipeVencedoraFinal = determinarEquipeVencedora(pontosFinais, notasDesignEquipes, pontosEquipes);
        System.out.println("A equipe vencedora da RoboCup é a Equipe: " + equipesFinais[equipeVencedoraFinal]);
        System.out.println("Parabéns! Equipe " + equipesFinais[equipeVencedoraFinal] + ".");
    }

    // Determina o vencedor entre duas equipes com base nos valores e nas notas de design
    public static int determinarVencedor(int valorEquipeA, int valorEquipeB, double notaDesignA, double notaDesignB) {
        if (valorEquipeA > valorEquipeB) {
            return 1;
        } else if (valorEquipeB > valorEquipeA) {
            return 2;
        } else {
            // Se houver empate, utiliza a nota de design para desempate
            if (notaDesignA > notaDesignB) {
                return 1;
            } else if (notaDesignB > notaDesignA) {
                return 2;
            } else {
                // Se ainda houver empate, retorne 0 
                return 0;
            }
        }
    }

    // Ordena as equipes por pontos e nota de design
    public static void ordenarEquipesPorPontosENota(int[] pontosEquipes, double[] notasDesignEquipes, int[] numerosEquipes) {
        int resulPontosNota = pontosEquipes.length;
        for (int i = 0; i < resulPontosNota - 1; i++) {
            for (int j = 0; j < resulPontosNota - i - 1; j++) {
                if (pontosEquipes[j] < pontosEquipes[j + 1] || (pontosEquipes[j] == pontosEquipes[j + 1] && notasDesignEquipes[j] < notasDesignEquipes[j + 1])) {
                    // Troca de posição
                    int tempPontos = pontosEquipes[j];
                    pontosEquipes[j] = pontosEquipes[j + 1];
                    pontosEquipes[j + 1] = tempPontos;

                    double tempNota = notasDesignEquipes[j];
                    notasDesignEquipes[j] = notasDesignEquipes[j + 1];
                    notasDesignEquipes[j + 1] = tempNota;

                    int tempNumero = numerosEquipes[j];
                    numerosEquipes[j] = numerosEquipes[j + 1];
                    numerosEquipes[j + 1] = tempNumero;
                }
            }
        }
    }

    // Determina a equipe vencedora da fase final
    public static int determinarEquipeVencedora( int[]pontosFinais, double[] notasDesignEquipes, int[] pontosEquipes) {
        int equipeVencedora = 0;
        for (int i = 1; i < 3; i++) {
            // Compara notas de design para determinar a equipe vencedora
            if (pontosFinais[i] > pontosFinais[equipeVencedora]) {
                equipeVencedora = i;
            }
        }
        return equipeVencedora;
    }

    // Verifica se já existe um número na lista de equipes
    public static boolean existeEquipeComNumero(int[] numerosEquipes, int numeroEquipe) {
        for (int numero : numerosEquipes) {
            if (numero == numeroEquipe) {
                return true;
            }
        }
        return false;
    }
}
