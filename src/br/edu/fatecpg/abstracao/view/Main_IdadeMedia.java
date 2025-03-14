package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.IdadeMedia;

public class Main_IdadeMedia {
	public static void main(String [] args){
        
        IdadeMedia media = new IdadeMedia();
        
        media.eventos ="declínio do feudalismo. ";
        media.periodo ="XI";
        
        System.out.println("O evento que houve foi o " +media.eventos);
        System.out.println("A época apresentada é" +media.periodo);
        
        
        media.acontecimentos();
        media.epoca();
    }	
}
