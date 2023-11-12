package fundamentos_Java;

public class estudoEstruturasdeRepetição {

	public static void main(String[] args) {

		System.out.println("Uso das variáveis na linguagem Java");
		String nome = "Guilherme";
		int idade = 51;
		char sexo = 'M';
		double temperatura = 26.7;
		boolean arCondicionado = false;
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("sexo: " + sexo);
		System.out.println("temperatura : " + temperatura);
		System.out.println("Ar condicionado : " + arCondicionado);
		System.out.println("_____________________________________");
		System.out.println("");

		System.out.println("Operadores Aritm. e Atrib.");
		int i = 10;
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 = " + (i + 5));
		System.out.println("i = " + i + " - 5 = " + (i - 5));
		System.out.println("i = " + i + " * 5 = " + (i * 5));
		System.out.println("i = " + i + " / 5 = " + (i / 5));
		System.out.println("i = " + i + " % 5 = " + (i % 5));
		System.out.println("i += 5 = " + (i += 5));
		System.out.println("i -= 5 = " + (i -= 5));
		System.out.println("i *= 5 = " + (i *= 5));
		System.out.println("i /= 5 = " + (i /= 5));
		i++;
		System.out.println("i++ = " + i);
		i--;
		System.out.println("i-- = " + i);
		String nome2 = "José";
		int idade2 = 50;
		System.out.println("A idade do Guilherme é maior?  " + (idade > idade2));
		System.out.println("A idade do José é maior?  " + (idade < idade2));
		System.out.println("_____________________________________");
		System.out.println("");

		System.out.println("Estruturas de Controle");
		System.out.println("");
		System.out.println("Estruturas de Controle Condicional");
		System.out.println("");
		System.out.println("Exemplo 1 - Uso do 'if' ");
		System.out.println("O Alistamento Militar é Obrigatório para o Guilherme?");
		if (sexo == 'M') {
			System.out.println("Alistamento Militar Obrigatório");
		}
		System.out.println("");

		System.out.println("Exemplo 2 - Uso do 'if - else' ");
		System.out.println("O Guilherme é maior de idade?");
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		System.out.println("");

		System.out.println("Exemplo 3 - Uso do 'else - if' ");
		idade = 16;
		System.out.println("Guilherme tem 16 anos, ele pode votar?");
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("VOTO OBRIGATÓRIO");
		} else {
			System.out.println("VOTO FACULTATIVO");
		}
		System.out.println("");

		System.out.println("Exemplo 4 - Uso do 'switch case' ");
		System.out.println("1. Cadastro de clientes");
		System.out.println("2. Cadastro de usuários");
		System.out.println("3. Cadastro de funcionários");
		System.out.println("O Guilherme é cadastrado em qual?");
		int opcao = 2;
		switch (opcao) {
		case 1:
			System.out.println("CLIENTES");
			break;
		case 2:
			System.out.println("USUÁRIOS");
			break;
		case 3:
			System.out.println("FUNCIONÁRIOS");
			break;
		default:
			System.out.println("NENHUM");
			break;
		}

		// Estruturas de Repetição
		// Começando pelo 'for'
		// for (int i = 1; i < 10; i++) {
		// //código
		// }

		// for (int j = 10; j > 0; j--){
		// //código
		// }

		System.out.println("");
		System.out.println("Estruturas de Repetição");
		System.out.println("");
		System.out.println("Exemplo 5 - Uso do 'for ' ");
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}

		System.out.println("");
		System.out.println("Exemplo 6 - Tabuada");
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <= 10; valor++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			}
		}

		// Para finalizar as Estruturas de Controle em geral, veremos
		// while - do while

		System.out.println("");
		System.out.println("Exemplo 7 - Uso da Estrutura 'while' ");
		System.out.println("Frequência da temperatura registrada hoje:");
		while (temperatura <= 31) {
			System.out.println(temperatura);
			temperatura++;
		}

		System.out.println("");
		System.out.println("Exemplo 8 - Uso da Estrutura 'do while' ");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente(s/n)?");
			novoJogo = 'n';
		} while (novoJogo == 's');
		System.out.println("GAME OVER");

	}
}
