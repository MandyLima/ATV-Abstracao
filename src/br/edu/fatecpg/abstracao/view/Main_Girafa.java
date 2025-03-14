package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Girafa;

public class Main_Girafa {
	
    public static void main(String[] args) {
        Girafa girafa = new Girafa();
        girafa.altura = 5.5;
        girafa.alimentacao = "Folhas de árvores";
        girafa.habitat = "Savanas africanas";

        girafa.mostrarAltura();
        girafa.mostrarAlimentacao();
        girafa.mostrarHabitat();
    }
}

