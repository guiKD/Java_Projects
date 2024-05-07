package br.com.fiap.jogo.app;

import javax.swing.JOptionPane;

import br.com.fiap.jogo.model.Forca;

public class JogoGui {
	
	public static void main(String[] args) {
		Forca f = new Forca();
		
		while(!f.acertou() && !f.enforcou()) {
			String msg = f.getPalavraFechada() + "\nErros: " + f.getErros();
		
			String s = JOptionPane.showInputDialog(null, msg, "Jogo da Forca", 
								JOptionPane.INFORMATION_MESSAGE);
			
			f.chuta(s.toLowerCase().charAt(0));
		}
		
		if (f.acertou())
			JOptionPane.showMessageDialog(null, "Parabéns, a palavra era " + 
												f.getPalavraAberta());
		else 
			JOptionPane.showMessageDialog(null, "Errou, a palavra era " + 
												f.getPalavraAberta());
	}
}
