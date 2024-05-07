package br.com.fiap.estapar.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;

public class ContaEstacionamento {
	
	private Veiculo veiculo;
	private LocalDateTime inicio;
	private LocalDateTime fim;
	
	public ContaEstacionamento(Veiculo veiculo) {
		this.veiculo = veiculo;
		this.inicio = LocalDateTime.now();
	}
	
	
	public double getValor(LocalDateTime fechamento) {
		this.fim = fechamento;
		long minutos = ChronoUnit.MINUTES.between(inicio, fim);
		//long horas = ChronoUnit.HOURS.between(inicio, fim);
		//long dias = ChronoUnit.DAYS.between(inicio, fim);
		//System.out.println("Min " + minutos);
		//System.out.println("HOras " + horas);
		//System.out.println("Dias " + dias);
		double horas = minutos / 60.0;
		if (horas <= 1) {
			return 10;
		}
		else if (horas <= 6) {
			double aux = Math.ceil(horas) - 1;
			return 10 + aux * 2;
		}
		else { //passou das 6 horas
			double dias = horas / 24;
			if (dias > 15)
				return 400;
			else {
				dias = Math.ceil(dias);
				return 22 * dias;
			}			
		}
	}
	
	
	public static void main(String args[]) {
		Veiculo v = new Veiculo();
		ContaEstacionamento ce = new ContaEstacionamento(v);
		LocalDateTime fim = LocalDateTime.of(2024, 5, 2, 23, 0);
		System.out.println(ce.getValor(fim));
	}
	
	
}
