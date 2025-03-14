package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Pintura;

public class Main_Pintura {
	public static void main(String[]args){
        
        Pintura paint = new Pintura();
        
        paint.pincel = "pincel chanfrado";
        paint.tipo_tinta ="tinta a óleo";
        paint.tipo_tecnica ="óleo sobre tela"; 
        
        paint.pintar();
        paint.secar();
        
        System.out.println("O tipo de pincel utilizado foi "+paint.pincel );
        System.out.println("A tinta usada para a pintura é a "+paint.tipo_tinta);
        System.out.println("A tecnica utilizada na pintura foi "+paint.tipo_tecnica);
	}
}