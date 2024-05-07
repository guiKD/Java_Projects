package br.com.fiap.ex5;

import java.util.Random;

public class Simulacao {


	public static double geraValor(Random rand) {
		boolean debito = rand.nextBoolean();
		if (debito) {
			return -rand.nextDouble() * 50_000;
		}
		else {
			return rand.nextDouble() * 50000;
		}
	}
	
	public static void simulacao(SaldoBancario conta, double valor) {
		if (valor < 0) {
			conta.debito(Math.abs(valor));
		}
		else {
			conta.credito(valor);
		}
	}

	public static void main(String[] args) {
		SaldoBancario sb_edu = new SaldoBancario("Edu", 1000);
		SaldoBancario sb_jose = new SaldoBancario("José", 4000);
		SaldoBancario sb_adri = new SaldoBancario("Adriana", 8000);

		double valor;
		Random r = new Random();

		for(int i = 0; i < 10; i++) {

			valor = geraValor(r);
			simulacao(sb_edu, valor);

			valor = geraValor(r);
			simulacao(sb_jose, valor);
			
			valor = geraValor(r);
			simulacao(sb_adri, valor);

		}
		System.out.println("Edu " + sb_edu.getSaldo());
		System.out.println("Edu: " + sb_edu.getConta());
		
		System.out.println("Adri " + sb_adri.getSaldo());
		System.out.println("Adri: " + sb_adri.getConta());
		
		System.out.println("Jose " + sb_jose.getSaldo());
		System.out.println("Jose: " + sb_jose.getConta());
		
	}
}
