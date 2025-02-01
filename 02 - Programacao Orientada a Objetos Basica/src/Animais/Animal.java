package Animais;

public class Animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected int tamanhoDoRabo;
    protected String estadoDeEspirito;

    public Animal(){

    }
    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    protected void comer(){}

    protected void dormir(){}

    public void soar(){
        System.out.println(" CRI CRI ");
    }
}
