package br.edu.fatecpg.abstracao.model;

public class Arte_digital {
	public String tecnica;
	public String aplicativo;
	public String tipo_mesa;
	
	public void tec() {
		System.out.println("Referenciando sua técnica...");
	}
	public void app() {
		System.out.println("Abrindo aplicativo...");
	}
	public void tipo() {
		System.out.println("Buscando versão da mesa digitalizadora...");
	}
}
