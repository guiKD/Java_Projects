package br.com.fiap.model;

public class CaixaSupermercado {

	private long id;
	private double imposto;
	private double total;
	private String cpf;
	private int quantidade;

	// armazenar a descrição dos produtos
	private String cupomFiscal;

	public CaixaSupermercado(String cpf) {
		super();
		this.cpf = cpf;
		this.imposto = 0;
		this.total = 0;
		this.quantidade = 0;
		this.cupomFiscal = "Super FIAP";
	}

	public long getId() {
		return id;
	}

	public double getImposto() {
		return imposto;
	}

	public double getTotal() {
		return total;
	}

	public String getCpf() {
		return cpf;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getCupomFiscal() {
		return cupomFiscal;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void adiciona(int qtd, double valor, String produto) {
		this.quantidade = this.quantidade + qtd;
		total = total + qtd * valor;

		String linha = String.format("%s\t %d X %.2f\t %.2f", produto, qtd, valor, qtd * valor);

		this.cupomFiscal = this.cupomFiscal + "\n" + linha;
	}

	public void adiciona(int qtd, double valor, String produto, String classificacao) {
		this.adiciona(qtd, valor, produto);

		double aux = qtd * valor;
		
		double aliquota = 0;

		if (classificacao.equals("Alimentos")) 
			aliquota = 3;
		else if (classificacao.equals("Limpeza"))
			aliquota = 5;
		else if (classificacao.equals("Higiene"))
			aliquota = 4;
		else if (classificacao.equals("fumo"))
			aliquota = 9;
		else if (classificacao.equals("bebida"))
			aliquota = 8;
		else if (classificacao.equals("outros"))
			aliquota = 10;
		
		this.imposto = this.imposto + aux * aliquota / 100;
			

	}

}
