package br.com.fiap.jogo.model;


import java.util.Random;

public class Dicionario {

   private String[] banco = {"Brasil","Africa do Sul","Alemanha","Angola","Argentina","Aruba","Bermudas","Cabo Verde","Canada","Chile","China","Colombia","Coreia do Sul","Costa Rica","Cuba","Dinamarca","Egito","Emirados Arabes"
,"Equador","Eslovaquia","Espanha","Estados Unidos","Filipinas","Finlandia","Grecia"
,"Groelandia","Guatemala","Haiti","Holanda","Honduras","Hong Kong","Hungria"
,"India","Indonesia","Iraque","Irlanda","Israel","Italia","Jamaica","Japao"
,"Jordania","Kuwait","Libano","Libia","Liechtenstein","Luxemburgo"
,"Malasia","Marrocos","Mexico","Nicaragua","Nigeria","Noruega"
,"Nova Zelandia","Panama","Paraguai","Peru","Polonia","Porto Rico","Portugal"
,"Russia","San Marino","Siria","Suecia","Tailandia","Tunisia","Turquia","Uruguai"
,"Venezuela"};
   
   private Random rand;  

   public Dicionario(){
      rand = new Random();
   }

   public String getPalavra(){
      int tam = banco.length;
      return banco[rand.nextInt(tam)];      
   }


   public static void main(String args[])
    {	 
       Dicionario dic = new Dicionario();
	for(int i=0; i< 300; i++)
           System.out.println(dic.getPalavra());
    }
}
