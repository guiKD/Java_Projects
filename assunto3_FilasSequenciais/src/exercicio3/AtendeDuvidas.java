package exercicio3;

import java.util.Scanner;

import filas.FilaInt;

public class AtendeDuvidas {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		FilaInt fila = new FilaInt();
		fila.init();
		int opcao;
		do {
			System.out.println(" 1 - Inserir aluno na fila");
			System.out.println(" 2 - Atender proximo aluno da fila");
			System.out.println(" 3 - Encerrar atendimento");
			opcao = le.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("RM: ");
				int rm = le.nextInt();
				fila.enqueue(rm);
				break;
			case 2:
				if (!fila.isEmpty())
					System.out.println("Aluno a ser atendido agora: "+ fila.dequeue());
				else
					System.out.println("Nao ha alunos na fila");
				break;
			case 3:
				if (fila.isEmpty())
					System.out.println("Encerrado atendimento");
				else {
					System.out.println("Ainda ha alunos na fila");
					opcao = 0;
				}
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 3);
		le.close();

	}

}
