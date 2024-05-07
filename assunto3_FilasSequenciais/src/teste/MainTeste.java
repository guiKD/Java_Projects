package teste;

import filas.FilaInt;

public class MainTeste {

	public static void main(String[] args) {
		FilaInt fila = new FilaInt();
		fila.init();
		
		fila.enqueue(23);
		fila.enqueue(66);
		fila.enqueue(17);
		fila.enqueue(44);
		
		while (!fila.isEmpty())
			System.out.println("Valor retirado: " + fila.dequeue());
	}

}
