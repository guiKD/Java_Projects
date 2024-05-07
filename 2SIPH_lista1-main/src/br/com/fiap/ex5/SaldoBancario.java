package br.com.fiap.ex5;

public class SaldoBancario {

	private static int sequence = 1;
			
	private String cliente;
	private double saldo;
	
	private int agencia = 1;
	
	private int conta;
	
	public SaldoBancario(String cliente, double saldo) {
		this.cliente = cliente;
		this.saldo = saldo;
		//this.conta = 938; //podemos melhorar depois
		this.conta = sequence;
		sequence++;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void credito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public String getCliente() {
		return cliente;
	}

	public int getConta() {
		return conta;
	}

	public void debito(double valor) {
		this.saldo = this.saldo - valor;
	}
}
