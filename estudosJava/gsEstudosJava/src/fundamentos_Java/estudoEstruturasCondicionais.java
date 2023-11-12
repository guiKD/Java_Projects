package fundamentos_Java;

public class estudoEstruturasCondicionais {

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

		// Estruturas de controle
		// Blocos de códigos que analisam os tipos de dados armazenados nas
		// variáveis, esses blocos de códigos escolhem uma direção para seguir
		// baseado em parâmetros pré-estabelecidos / Processos de tomadas de
		// decisões

		// Existem dois tipos de Estruturas de controle, sendo elas:
		// Estrutura de Controle Condicional
		// Estrutura de Repetições (laços)

		// Estruturas de Controle Condicional
		// if - if else - else if

		// if (condição) {
		// verdadeira
		// }

		// if (condição) {
		// //verdadeira
		// } else {
		// //falsa
		// }

		// if (condição 1) {
		// //condição 1 verdadeira
		// } else if (condição 2) {
		// //condição 2 verdadeira
		// } else {
		// //nenhuma condição verdadeira
		// }

		System.out.println("Estruturas de Controle");
		System.out.println("");
		System.out.println("Estruturas de Controle Condicional");
		System.out.println("");
		System.out.println("Exemplo 1 - Uso do 'if' ");
		System.out.println("O Alistamento Militar é Obrigatório para o Guilherme?");
		if (sexo == 'M') {
			System.out.println("Alistamento Militar Obrigatório");
			// Somente é escrito no console se a condição for verdadeira ->
			// sexo do Guilherme é 'M' == verdadeiro
		}
		System.out.println("");
		System.out.println("Exemplo 2 - Uso do 'if - else' ");
		System.out.println("O Guilherme é maior de idade?");
		// idade = 17; se alterar durante o código o valor da variável,
		// mudará no console para 'Menor de idade'
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

		// Continuando Estruturas de Controle Condicional
		// Agora veremos o Switch case

		// switch (variável) {
		// case 1:
		// //código (variável igual a 1)
		// break;
		// case 2:
		// //código (variável igual a 2)
		// break;
		// case 3:
		// //código (variável igual a 3)
		// break;
		// default:
		// código (variável diferente de 1, 2 ou 3)
		// break;
		// }

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
	}
}
