package construtores;

public class ProdutoTestar {

	public static void main(String[] args) {
		
		//Construtor sem parâmetro 
		Produto p = new Produto();
		p.nome = "Corretivo escolar";
		p.marca = "Tilibra";
		p.valor = 1.27f;

		//Construtor de 1 parâmetro
		Produto p1 = new Produto("Caneta azul");
		p1.marca = "Bic";
		p1.valor = 1.50f;
		
		//Construtor de 2 parâmetros
		Produto p2 = new Produto("Borracha", "Faber");
		p2.valor = 1.69f;
		
		//Construtor de 3 parâmetros
		Produto p3 = new Produto("Lápis", "Mercur", 1.89f);
		
		System.out.println("Nome: " + p.nome + "    Marca: " + p.marca + "   Valor: " + p.valor);
		
		System.out.println("Nome: " + p1.nome + "    Marca: " + p1.marca + "   Valor: " + p1.valor);
		
		System.out.println("Nome: " + p2.nome + "    Marca: " + p2.marca + "   Valor: " + p2.valor);
		
		System.out.println("Nome: " + p3.nome + "    Marca: " + p3.marca + "   Valor: " + p3.valor);
	
	}

}
