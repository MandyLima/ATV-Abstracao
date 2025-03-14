package br.edu.fatecpg.abstracao.model;

public class Celula {
	public String tipo_celula;
    public String funcionalidade;
    public String quantidade;
    
    
    public void tipo(){
        System.out.println("Procurando célula...");
    }
    public void funcao(){
        System.out.println("Procurando função...");
    }
    public void valor(){
        System.out.println("Buscando quantidade de células...");
    }
}
