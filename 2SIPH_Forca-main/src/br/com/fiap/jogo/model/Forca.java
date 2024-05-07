package br.com.fiap.jogo.model;

/**
 * 
 * @author Eduardo Gondo 2SIPH
 * 
 * Classe responsável pela criação do Jogo da Forca.
 * Ela pega a palavra a ser descoberta da classe
 * Dicionario.
 *
 */
public class Forca {
	
	private String palavra;
	private int maxErros;
	private int erros;
	
	//controla se devemos apresentar a letra
	//ou o _ na tela
	private boolean[] mostra;
	
	
	/**
	 * Construtor inicializa a palavra pegando do 
	 * Dicionario e coloca o número máximo de erros
	 * como 6.	
	 */
	public Forca() {
		this.maxErros = 6;
		Dicionario dic = new Dicionario();
		this.palavra = dic.getPalavra();
		
		this.mostra = new boolean[this.palavra.length()];
		
		this.chuta(' ');
		this.erros = 0;
	}
	
	/**
	 * 
	 * @return retorna o número de erros cometidos
	 */
	public int getErros() {
		return erros;
	}
	
	/**
	 * 
	 * @return true se o usuário esgotou as chances 
	 * false caso contrário
	 *
	 */
	public boolean enforcou() {
		return erros >= maxErros;
		//if (erros >= maxErros)
		//	return true;
		//else
		//	return false;
	}
	
	public boolean acertou() {
		for(boolean b : mostra) {
			if (b == false)
				return false;
		}
		return true;
	}
	
	public String getPalavraAberta() {
		return palavra;
	}
	
	
	
	public String getPalavraFechada() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < mostra.length; i++) {
			if (mostra[i]) {
				sb.append(palavra.charAt(i));
				sb.append(' ');
			}
			else
				sb.append("_ ");
		}
		return sb.toString();
	}
	
	
	public void chuta(char letra) {
		boolean encontrei = false;
		String palMin = palavra.toLowerCase();

		for (int i = 0; i < mostra.length; i++) {
			if (palMin.charAt(i) == letra) {
				mostra[i] = true;
				encontrei = true;
			}
		}
		if (!encontrei)
			this.erros++;
	}
}
