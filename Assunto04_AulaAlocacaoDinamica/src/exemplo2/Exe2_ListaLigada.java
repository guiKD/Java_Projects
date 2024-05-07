package exemplo2;

public class Exe2_ListaLigada {

	public static void main(String[] args) {

		NoLista lista = new NoLista();
		lista.dado = 1;
		lista.prox = null;
		System.out.println("lista :" + lista);
		System.out.println(" lista.dado :" + lista.dado);
		System.out.println(" lista.prox :" + lista.prox);
		
		NoLista novo = new NoLista();
		novo.dado = 2;
		novo.prox = null;
		
		lista.prox = novo;
		
		System.out.println("\n\n Depois da insercao 2o no");
		System.out.println(" lista :" + lista);
		System.out.println("   lista.dado :" + lista.dado);
		System.out.println("   lista.prox :" + lista.prox);
		System.out.println("\n novo :" + novo);
		System.out.println("   novo.dado :" + novo.dado);
		System.out.println("   novo.prox :" + novo.prox);
	}

}
