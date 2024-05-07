package br.com.fiap.model;

public class Partida {
	
	private Time casa;
	
	private Time visitante;
	
	int golsCasa;
	
	int golsVisitante;

	public Partida(Time casa, Time visitante, int golsCasa, int golsVisitante) {
		this.casa = casa;
		this.visitante = visitante;
		this.golsCasa = golsCasa;
		this.golsVisitante = golsVisitante;
		
		if (golsCasa > golsVisitante) {
			//int pts = this.casa.getPontos();
			//this.casa.setPontos(pts + 3);
			this.casa.addVitoria();
		}
		else if (golsCasa < golsVisitante) {
			//int pts = this.visitante.getPontos();
			//this.visitante.setPontos(pts + 3);
			this.visitante.addVitoria();
		}
		else {
			//int ptsC = this.casa.getPontos() + 1;
			//int ptsV = this.visitante.getPontos() + 1;
			//this.casa.setPontos(ptsC);
			//this.visitante.setPontos(ptsV);
			this.casa.addEmpate();
			this.visitante.addEmpate();
		}
	}
	
	

}
