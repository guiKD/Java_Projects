package br.com.fiap.model;

import java.sql.Date;

public class Produto {

	private int codigo;
	private String nome;
	private double valor;
	private int quantidade;
	private Date data = new Date(System.currentTimeMillis());
	private Categoria categoria;
	
	public Produto() {
		
	}
	
	public Produto(String nome, double valor, int quantidade) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	
}
