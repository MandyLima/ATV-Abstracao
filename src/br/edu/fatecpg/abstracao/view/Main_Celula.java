package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Celula;

public class Main_Celula {
	public static void main(String [] args){
	        
	        Celula celula = new Celula ();
	        
	        celula.tipo_celula = "Células vermelhas";
	        celula.funcionalidade = "transportar oxigênio";
	        celula.quantidade ="4 milhões";
	        
	        System.out.println("O tipo da célula buscada foi: "+celula.tipo_celula);
	        System.out.println("Ela tem a função de "+celula.funcionalidade);
	        System.out.println("A quantidade de células é de: "+celula.quantidade);
	        
	        celula.tipo();
	        celula.funcao();
	        celula.valor();
	    }
}
