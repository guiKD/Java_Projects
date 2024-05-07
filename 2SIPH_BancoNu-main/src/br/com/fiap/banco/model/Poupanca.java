package br.com.fiap.banco.model;

import java.time.LocalDate;

public class Poupanca extends Conta {
	
	private static double rendimento = 0.5;
	
	private double[] valores;
	
	
	public Poupanca(Cliente cliente, double saldo) {
		super(cliente, saldo);
		valores = new double[32];
		
		int dia = this.getDiaMes();
		valores[dia] = saldo;
	}
	
	public void depositar(double valor) {
		super.depositar(valor);
		int dia = this.getDiaMes();
		valores[dia] = valores[dia] + valor;
	}

	
	private int getDiaMes() {
		LocalDate hoje = LocalDate.now();
		return hoje.getDayOfMonth();
	}
	
	
	public void aplicaRendimento() {
		int dia = this.getDiaMes();
		
		double vlRend = 0;
		vlRend = valores[dia] * Poupanca.rendimento / 100;
		
		this.depositar(vlRend);
	}
	
	
	public void sacar(double valor) throws Exception {
		if (valor > this.getSaldo()) 
			throw new Exception("Insuficient Balance");
		else {
			super.sacar(valor);
			int dia = this.getDiaMes();
			
			while(valor > 0) {
				if (valor < valores[dia]) {
					valores[dia] = valores[dia] - valor;
					valor = 0;
				}
				else {
					valor = valor - valores[dia];
					valores[dia] = 0;
				}
				dia--;
				if (dia == 0) {
					dia = 31;
				}
			}
		}
	}
	
	
	
}
