package fundamentos_Java;

public class estudoOperadores {

	public static void main(String[] args) {

		// Operadores Aritméticos
		// = -> fornecer valor a uma variável / Exemplo: i = 10 / Resultado: 
		//                                                         i = 10
		
		// + -> Soma / Exemplo: i = 10 + 5 / Resultado: i = 15
		
		// - -> Subtração / Exemplo: i = 10 - 5 / Resultado: i = 5
		
		// * -> Multiplicação / Exemplo: i = 10 * 5 / Resultado: i = 50
		
		// / -> Divisão / Exemplo: i = 10 / 5 / Resultado: i = 2
		
		// % -> Resto da divisão / Exemplo: i = 10 % 5 / Resultado: i = 0
		
		// += -> somar o valor / Exemplo: i += 5 / Resultado: i = 15
		
		// -= -> subtrair o valor / Exemplo: i -= 5 / Resultado: i = 10
		
		// *= -> multiplicar o valor / Exemplo: i *= 5 / Resultado: i = 50
		
		// /= -> dividir o valor / Exemplo: i /= 5 / Resultado: i = 10
		
		// ++ -> Adicionar 1 ao valor / Exemplo: i++(i = i + 1) // i = 11
		
		// -- -> Subtrair 1 ao valor / Exemplo: i--(i = i - 1) // i = 10
		
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
		
		//Operadores Comparativos
		// > -> Maior que
		
		// >= -> Maior ou igual a 
		
		// < -> Menor que 
		
		// <= -> Menor ou igual a 
		
		// == -> Igual a
		
		// != -> Diferente de
		
		String nome2 = "José";
		int idade2 = 50;
		System.out.println("A idade do Guilherme é maior?  " + (idade > idade2));
		System.out.println("A idade do José é maior?  " + (idade < idade2));
	
		// Operadores Lógicos 
		// && -> AND
		
		// || -> OR
		
		// ! -> NOT
	}

}
