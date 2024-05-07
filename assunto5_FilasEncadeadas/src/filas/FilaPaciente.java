package filas;

import exercicio4.Paciente;

public class FilaPaciente {
	
	private class NO{
		Paciente dado;
		NO prox;
	}
	
	NO ini, fim;
	
	public void init() {
		ini = fim = null;
	}
	public boolean isEmpty() {
		return (ini==null && fim==null);
	}
	public void enqueue(Paciente elem) {
		NO novo = new NO();
		novo.dado = elem;
		System.out.println(novo.dado);
		novo.prox = null;
		if (isEmpty())
			ini = novo;
		else
			fim.prox = novo;
		
		fim = novo;
	}
	public Paciente first() {
		return (ini.dado);
	}
	public Paciente dequeue() {
		Paciente valor = ini.dado;
		ini = ini.prox;
		if (ini==null)
			fim = null;
		return valor;
	}
	
	
	
	
	
}
