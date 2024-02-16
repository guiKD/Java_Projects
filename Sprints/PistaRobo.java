import java.util.Scanner;

public class PistaRobo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contPassos = 1;
        int passos = 1;
        int potencia = 0;
        int distancia = 0;
        int chegou = 0;
        String direcao;

        System.out.println("Bem-vindo(a) ao simulador de movimentação do MoBô! (Um produto Talon)");

        do {
            System.out.println("Digite a potência da bateria que você gostaria de colocar no MoBô (Utilize Volts. Voltagem recomendada: 220): ");

            if (entrada.hasNextInt()) {
                potencia = entrada.nextInt();

                if (potencia < 220) {
                    System.out.println("Potência insuficiente. O MoBô não conseguirá completar o percurso.");
                } else if (potencia > 330) {
                    System.out.println("Potência muito alta. O MoBô pode não suportar e ser danificado.");
                }
            } else {
                System.out.println("Código inválido. Por favor, digite um número inteiro.");
                entrada.next();
            }
        } while (potencia < 220 || potencia > 330);

        System.out.println("Potência suficiente. O MoBô conseguirá completar o percurso.");
        System.out.println("Pedimos que siga o roteiro entregue para aproveitar ao máximo o simulador.");


        if (contPassos == 1) {
        	while (true) {
        	    System.out.println("Digite a direção que o MoBô vai dar a seguir: ");
        	    direcao = entrada.next().toLowerCase();

        	    if (direcao.equals("baixo")) {
        	        System.out.println("Digite quantos passos o MoBô deu para baixo: ");
        	        passos = entrada.nextInt();
        	        if (passos == 10) {
        	            System.out.println("O MoBô deu 10 passos para baixo");
        	            contPassos++;
        	            break; 
        	        } else {
        	            System.out.println("Quantidade de passos inválida, tente novamente.");
        	        }
        	    } else {
        	        System.out.println("Direção inválida, tente novamente.");
        	    }
        	}
        }
        if (contPassos == 2) {
        	while (true) {
        	    System.out.println("Digite a direção que o MoBô vai dar a seguir: ");
        	    direcao = entrada.next().toLowerCase();

        	    if (direcao.equals("direita")) {
        	        System.out.println("Digite quantos passos o MoBô deu para a direita: ");
        	        passos = entrada.nextInt();
        	        if (passos == 10) {
        	            System.out.println("O MoBô deu 10 passos para a direita");
        	            contPassos++;
        	            break; 
        	        } else {
        	            System.out.println("Quantidade de passos inválida, tente novamente.");
        	        }
        	    } else {
        	        System.out.println("Direção inválida, tente novamente.");
        	    }
        	}
        }
        if (contPassos == 3) {
        	while (true) {
        	    System.out.println("Digite a direção que o MoBô vai dar a seguir: ");
        	    direcao = entrada.next().toLowerCase();

        	    if (direcao.equals("baixo")) {
        	        System.out.println("Digite quantos passos o MoBô deu para baixo: ");
        	        passos = entrada.nextInt();
        	        if (passos == 9) {
        	            System.out.println("O MoBô deu 9 passos para baixo");
        	            contPassos++;
        	            break; 
        	        } else {
        	            System.out.println("Quantidade de passos inválida, tente novamente.");
        	        }
        	    } else {
        	        System.out.println("Direção inválida, tente novamente.");
        	    }
        	}
        }
        if (contPassos == 4) {
        	while (true) {
        	    System.out.println("Digite a direção que o MoBô vai dar a seguir: ");
        	    direcao = entrada.next().toLowerCase();

        	    if (direcao.equals("esquerda")) {
        	        System.out.println("Digite quantos passos o MoBô deu para a esquerda: ");
        	        passos = entrada.nextInt();
        	        if (passos == 9) {
        	            System.out.println("O MoBô deu 9 passos para a esquerda");
        	            contPassos++;
        	            break; 
        	        } else {
        	            System.out.println("Quantidade de passos inválida, tente novamente.");
        	        }
        	    } else {
        	        System.out.println("Direção inválida, tente novamente.");
        	    }
        	}
        }
        if (contPassos == 5) {
        	while (true) {
        	    System.out.println("Digite a direção que o MoBô vai dar a seguir: ");
        	    direcao = entrada.next().toLowerCase();

        	    if (direcao.equals("baixo")) {
        	        System.out.println("Digite quantos passos o MoBô deu para baixo: ");
        	        passos = entrada.nextInt();
        	        if (passos == 7) {
        	            System.out.println("O MoBô deu 7 passos para baixo");
        	            contPassos++;
        	            break; 
        	        } else {
        	            System.out.println("Quantidade de passos inválida, tente novamente.");
        	        }
        	    } else {
        	        System.out.println("Direção inválida, tente novamente.");
        	    }
        	}
        }
        if (contPassos == 6) {
        	while (true) {
        	    System.out.println("Digite a direção que o MoBô vai dar a seguir: ");
        	    direcao = entrada.next().toLowerCase();

        	    if (direcao.equals("direita")) {
        	        System.out.println("Digite quantos passos o MoBô deu para a direita: ");
        	        passos = entrada.nextInt();
        	        if (passos == 9) {
        	            System.out.println("O MoBô deu 9 passos para a direita");
        	            contPassos++;
        	            break; 
        	        } else {
        	            System.out.println("Quantidade de passos inválida, tente novamente.");
        	        }
        	    } else {
        	        System.out.println("Direção inválida, comece novamente.");
        	    }
        	}
        }
        if (contPassos == 7) {
        	while (true) {
        	    System.out.println("Digite a direção que o MoBô vai dar a seguir: ");
        	    direcao = entrada.next().toLowerCase();

        	    if (direcao.equals("cima")) {
        	        System.out.println("Digite quantos passos o MoBô deu para cima: ");
        	        passos = entrada.nextInt();
        	        if (passos == 4) {
        	            System.out.println("O MoBô deu 4 passos para cima");
        	            contPassos++;
        	            chegou++;
        	            break; 
        	        } else {
        	            System.out.println("Quantidade de passos inválida, tente novamente.");
        	        }
        	    } else {
        	        System.out.println("Direção inválida, tente novamente.");
        	    }
        	}
        	if (chegou == 1) {
        		System.out.println("O MoBô completou o percurso!");
        	}
        }
        
        
        }
        
    }
