package br.com.fiap.model;

public class Time {
	
	private String nome;
	
	private int pontos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public void addVitoria() {
		pontos = pontos + 3;
	}
	
	public void addEmpate() {
		pontos++;
	}

}
