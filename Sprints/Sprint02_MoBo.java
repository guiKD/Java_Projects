
import java.util.Scanner;

public class Sprint02_MoBo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contPassos = 1;
        int passos = 1;
        int potencia = 0;
        int vidas = 0;
        int chegou = 0;
        String direcao;

        System.out.println("Bem-vindo(a) ao simulador de movimentação do MoBô! (Um produto Talon)");

        do {
            System.out.println("Digite a potência da bateria que você gostaria de colocar no MoBô (Utilize Volts. Voltagem recomendada: 220): ");

            if (entrada.hasNextInt()) {
                potencia = entrada.nextInt();

                if (potencia < 220) {
                    System.out.println("Potência insuficiente. O MoBô não conseguirá completar o percurso.");
                    vidas = 0;
                } else if (potencia >= 220 && potencia <= 330) {
                    vidas = (potencia - 220) / 10 + 1;
                    System.out.println("Potência suficiente. O MoBô tem " + vidas + " vida(s) para completar o percurso.");
                } else if (potencia > 330) {
                    System.out.println("Potência muito alta. O MoBô pode não suportar e ser danificado.");
                    vidas = 4;
                }
            } else {
                System.out.println("Código inválido. Por favor, digite um número inteiro.");
                entrada.next();
            }
        } while (potencia < 220 || potencia > 330);

        System.out.println("Pedimos que siga o roteiro entregue para aproveitar ao máximo o simulador.");

        while ((contPassos <= 7 && vidas > 0) || vidas == 0) {
            if (vidas == 0) {
                System.out.println("Deseja adicionar mais potência ao MoBô? (S/N): ");
                String resposta = entrada.next().toUpperCase();

                if (resposta.equals("S")) {
                    do {
                        System.out.println("Digite a nova potência da bateria que você gostaria de colocar no MoBô (Entre 220 e 330): ");

                        if (entrada.hasNextInt()) {
                            potencia = entrada.nextInt();

                            if (potencia >= 220 && potencia <= 330) {
                                vidas = (potencia - 220) / 10 + 1;
                                System.out.println("Potência atualizada, caminho reiniciado. O MoBô tem " + vidas + " vida(s) para completar o percurso.");
                                contPassos = 1;
                                break;
                            } else {
                                System.out.println("Potência inválida. Por favor, digite um valor entre 220 e 330.");
                            }
                        } else {
                            System.out.println("Código inválido. Por favor, digite um número inteiro.");
                            entrada.next();
                        }
                    } while (true);
                } else if (resposta.equals("N")) {
                    System.out.println("Encerrando o simulador do MoBô. Obrigado por usar!");
                    break;
                } else {
                    System.out.println("Resposta inválida. Digite 'S' para adicionar mais potência ou 'N' para encerrar o programa.");
                }
            }

            System.out.println("Digite a direção que o MoBô vai dar a seguir: ");
            direcao = entrada.next().toLowerCase();

            if (direcao.equals("baixo") || direcao.equals("direita") || direcao.equals("esquerda") || direcao.equals("cima")) {
                System.out.println("Digite quantos passos o MoBô vai dar: ");
                passos = entrada.nextInt();

                if (contPassos == 1 && direcao.equals("baixo") && passos == 10) {
                    System.out.println("O MoBô deu 10 passos para baixo");
                    contPassos++;
                } else if (contPassos == 2 && direcao.equals("direita") && passos == 10) {
                    System.out.println("O MoBô deu 10 passos para a direita");
                    contPassos++;
                } else if (contPassos == 3 && direcao.equals("baixo") && passos == 9) {
                    System.out.println("O MoBô deu 9 passos para baixo");
                    contPassos++;
                } else if (contPassos == 4 && direcao.equals("esquerda") && passos == 9) {
                    System.out.println("O MoBô deu 9 passos para a esquerda");
                    contPassos++;
                } else if (contPassos == 5 && direcao.equals("baixo") && passos == 7) {
                    System.out.println("O MoBô deu 7 passos para baixo");
                    contPassos++;
                } else if (contPassos == 6 && direcao.equals("direita") && passos == 9) {
                    System.out.println("O MoBô deu 9 passos para a direita");
                    contPassos++;
                } else if (contPassos == 7 && direcao.equals("cima") && passos == 4) {
                    System.out.println("O MoBô deu 4 passos para cima");
                    contPassos++;
                    chegou++;
                    break;
                } else {
                    System.out.println("O MoBô bateu!");
                    vidas--;
                    System.out.println("Vidas restantes: " + vidas);
                }
            } else {
                System.out.println("Direção inválida, tente novamente.");
            }
        }

        if (chegou == 1) {
            System.out.println("O MoBô completou o percurso!");
            System.out.println("Restaram " + vidas + " vidas");
        } else {
            System.out.println("O MoBô não completou o percurso!");
        }
    }
}
