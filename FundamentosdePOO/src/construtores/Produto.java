package construtores;

public class Produto {

	// O que são construtores?
// Os construtores são os métodos responsáveis por criar
// o objeto, instanciando a classe que foi definida.

	// atributos
	String nome;
	String marca;
	float valor; // float permite armazenar valores com ponto

	// construtores
	Produto() {

	}

	public Produto(String nome) {
		super();
		this.nome = nome;
	}
	
	
	public Produto(String nome, String marca) {
		super();
		this.nome = nome;
		this.marca = marca;
	}

	public Produto(String nome, String marca, float valor) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.valor = valor;
	}

}
