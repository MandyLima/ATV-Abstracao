package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Genetica;

public class Main_Genetica {
	public static void main(String[] args) {
        Genetica genetica = new Genetica("ATCGGA", "Hereditariedade Humana", "Nenhuma");

        genetica.analisarSequenciaDNA();
        genetica.estudarHereditariedade();
        genetica.detectarMutacao("ATCGGC"); 
    }
}
