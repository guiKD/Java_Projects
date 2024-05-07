package aula03;

public class AlunoTestar {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Guilherme");	
		
		System.out.println("Nome: " + aluno1.getNome());
		
		aluno1.setIdade(19);
		
		System.out.println("Idade: " + aluno1.getIdade());
	}

}
