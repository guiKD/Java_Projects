package br.com.fiap.app;

import br.com.fiap.model.CaixaSupermercado;

public class TesteSupermercado {

	public static void main(String[] args) {
		
		CaixaSupermercado pdv = new CaixaSupermercado("623.423.930-23");
		
		pdv.adiciona(3, 9.75, "Óleo", "Alimentos");
		pdv.adiciona(4, 8.50, "Feijão", "Alimentos");
		pdv.adiciona(2, 24.99, "Arroz", "Alimentos");
		pdv.adiciona(4, 4.68, "Sabonete", "Higiene");
		pdv.adiciona(12, 5.50, "Heineken", "Bebida");
		
		System.out.println(pdv.getCupomFiscal());
		System.out.println("Impostos " + pdv.getImposto());
		System.out.println("Total " + pdv.getTotal());

	}

}
