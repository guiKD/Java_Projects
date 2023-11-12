package fundamentos_Java;

public class estudoVariaveis {

	public static void main(String[] args) {

		// Na programação, utilizamos as variáveis para armazenar
		// dados na memória

		// Principais variáveis: int, double, boolean, char e
		// String

		String nome = "Guilherme";
		// ou nome = "Guilherme";
		int idade = 51;
		// números inteiros
		char sexo = 'M';
		// char é sempre com aspas simples e deve ter somente um
		// caracter
		double temperatura = 26.7;
		// números não inteiros
		boolean arCondicionado = false;
		// verdadeiro ou falso
		System.out.println("Nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("sexo: " + sexo);
		System.out.println("temperatura : " + temperatura);
		System.out.println("Ar condicionado : " + arCondicionado);
	}

}
