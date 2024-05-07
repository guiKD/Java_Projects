package br.com.fiap.ex1;

public class Endereco {
	
	private String logradouro;
	private String cep;
	private String numero;
	private String bairro;
	private String complemento;
	private String cidade;
	private String uf;
	
	
	
	public Endereco() {
		super();
	}



	public Endereco(String logradouro, String cep, String numero, String bairro, String complemento, String cidade,
			String uf) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cidade = cidade;
		this.uf = uf;
	}



	public String getLogradouro() {
		return logradouro;
	}



	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}



	public String getCep() {
		return cep;
	}



	public void setCep(String cep) {
		this.cep = cep;
	}



	public String getNumero() {
		return numero;
	}



	public void setNumero(String numero) {
		this.numero = numero;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getComplemento() {
		return complemento;
	}



	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getUf() {
		return uf;
	}



	public void setUf(String uf) {
		this.uf = uf;
	}

	
}
