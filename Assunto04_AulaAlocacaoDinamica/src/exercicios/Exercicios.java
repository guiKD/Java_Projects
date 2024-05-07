package exercicios;

import exercicios.NoLista;

public class Exercicios {
	public static void main(String[] args) {

		NoLista lista = new NoLista();
		lista.dado = 1;
		lista.prox = null;
		
		NoLista novo = new NoLista();
		novo.dado = 2;
		novo.prox = null;
		
		lista.prox = novo;
		
		NoLista novo2 = new NoLista();
		novo2.dado = 3;
		novo2.prox = lista;
		
		lista = novo2;
		
		NoLista aux = lista;
		while (aux!=null) {
			System.out.println(aux);
			System.out.println(aux.dado);
			aux = aux.prox;
		}
		
	}

}
