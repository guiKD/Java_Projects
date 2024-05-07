package exercicio2;

import java.util.Scanner;

import filas.FilaInt;

public class Processador {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		FilaInt filaProcessos = new FilaInt();
		filaProcessos.init();
		int opcao;
		do {
			System.out.println(" 1 - Submete processo");
			System.out.println(" 2 - Executa processo (ocupa processador)");
			System.out.println(" 3 - Shutdown");
			opcao = le.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("PID: ");
				int pid = le.nextInt();
				filaProcessos.enqueue(pid);
				break;
			case 2:
				if (!filaProcessos.isEmpty()) {
					pid = filaProcessos.dequeue();
					System.out.println("Processo em execucao agora: " + pid);
					System.out.print("Processo " + pid + " foi concluido? (1- sim): ");
					int resp = le.nextInt();
					if (resp == 1)
						System.out.println("Processo " + pid + " foi concluido. ");
					else
						filaProcessos.enqueue(pid);
				} else
					System.out.println("Nao ha processos na fila");
				break;
			case 3:
				if (!filaProcessos.isEmpty()) {
					System.out.println("Ainda ha processos na fila");
					System.out.print(" Deseja encerrar todos os processos? (1- sim): ");
					int resp = le.nextInt();
					if (resp == 1) {
						while (!filaProcessos.isEmpty()) {
							System.out.println(" Encerrando o processo "+ filaProcessos.dequeue());
						}
					}
					else
						opcao = 0;
				}
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 3);
		System.out.println(" Shutdown ...");
		le.close();

	}

}
