package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Arte_digital;

public class Main_Digital {
	public static void main(String[] args) {
		Arte_digital digital = new Arte_digital();

		digital.tecnica = "pintura digital";
		digital.aplicativo = "ClipStudio";
		digital.tipo_mesa ="Wacom CTL4100";
		
		System.out.println("A técnica utilizada na arte é " +digital.tecnica);
		System.out.println("O app usado para criar a arte foi  " +digital.aplicativo);
		System.out.println("O tipo da mesa digitalizadora é a " +digital.tipo_mesa);
		
		digital.tec();
		digital.app();
		digital.tipo();
		
	}
}
