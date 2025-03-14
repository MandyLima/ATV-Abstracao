package br.edu.fatecpg.abstracao.model;

public class Girafa {
	
	public double altura;
    public String alimentacao;
    public String habitat;

    public void mostrarAltura() {
        System.out.println("A altura da girafa é: " + altura + " metros");
    }

    public void mostrarAlimentacao() {
        System.out.println("A alimentação da girafa é: " + alimentacao);
    }

    public void mostrarHabitat() {
        System.out.println("O habitat da girafa é: " + habitat);
    }

}

