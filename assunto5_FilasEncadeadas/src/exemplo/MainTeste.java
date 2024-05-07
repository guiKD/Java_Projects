package exemplo;

import java.io.File;

import filas.FilaInt;

public class MainTeste {

	public static void main(String[] args) {
		FilaInt fila = new FilaInt();
		fila.init();
		
		fila.enqueue(23);
		fila.enqueue(44);
		fila.enqueue(38);
		
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		

	}

}
