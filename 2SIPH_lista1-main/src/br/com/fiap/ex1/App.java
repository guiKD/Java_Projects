package br.com.fiap.ex1;

public class App {

	public static void main(String[] args) {
		Endereco meu = new Endereco("Av Paulista", "02590-000", "1106", 
				"Jardins", null, "São Paulo", "SP");
		
		Endereco avo = new Endereco("Rua Rosa", "0429-000", "101",
				"Centro", "apto 404", "São Paulo", "BA");
		
		Endereco fiap = new Endereco();
		fiap.setBairro("Aclimação");
		fiap.setCep("0234-001");
		fiap.setCidade("São Paulo");
		fiap.setLogradouro("Av Lins de Vasconcelos");
		fiap.setNumero("1220");
		
			
	}
	
}
