package exercicio4;

import java.util.Scanner;

import filas.FilaPaciente;

public class Consultorio {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		FilaPaciente fila = new FilaPaciente();
		fila.init();
		int opcao;
		do {
			System.out.println(" 1 - Inserir paciente na fila");
			System.out.println(" 2 - Atender proximo paciente da fila");
			System.out.println(" 3 - Encerrar atendimento");
			opcao = le.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("Nome: ");
				le.nextLine();
				String nome = le.nextLine();
				System.out.print(" Idade: ");
				int idade = le.nextInt();
				Paciente pac = new Paciente(nome, idade);
				fila.enqueue(pac);
				break;
			case 2:
				if (!fila.isEmpty())
					System.out.println("Paciente a ser atendido agora: "+ fila.dequeue());
				else
					System.out.println("Nao ha pacientes na fila");
				break;
			case 3:
				if (fila.isEmpty())
					System.out.println("Encerrado atendimento");
				else {
					System.out.println("Ainda ha pacientes na fila");
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
