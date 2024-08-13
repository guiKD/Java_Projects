package br.com.fiap.jdbc.model;

public class Produto {

	private int idProduto,idCategoria;
	private String nome,descricao;
	private double preco;
	
	
	public Produto() {
	}


	public Produto(int idCategoria, String nome, String descricao, double preco) {
		this.idCategoria = idCategoria;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}


	public int getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}


	public int getIdCategoria() {
		return idCategoria;
	}


	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
}
