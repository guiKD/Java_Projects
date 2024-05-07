package exemplos.aluno;

public class AlunoTeste {

	public static void main(String[] args) {

		//Definições
// Um objeto é uma instância criada a partir de um deter-
// minada classe.
		
// A classe AlunoTeste representa o objeto, dentro dela é
// preciso chamar o método main.
		
// Após instanciar o objeto é possível declarar valores aos
// atributos e chamar os métodos.
		
		Aluno aluno1 = new Aluno();
		
		aluno1.nome = "Guilherme Korus";
		aluno1.idade = 19;
		aluno1.curso = "Sistemas de Informação";
		
		aluno1.assistirAula();
		aluno1.fazerProva();
		aluno1.calcularNota();
		
	}

}
