package Animais;

public class Cachorro {
    //Atributos
    static int numeroDeCachorros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    //Construtor padrão
    public Cachorro(){

    }
    //Construtores adicionados
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDeCachorros++;
    }

    //Métodos


    public int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void comer(){
    }

    public void latir(){
        System.out.println("AU AU");
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        switch(acao){
            case "carinho": this.estadoDeEspirito = "feliz"; break;
            case "vai dormir!": this.estadoDeEspirito = "Bravo"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "Neutro"; break;
        }
//        if(acao.equals("carinho")){
//            this.estadoDeEspirito = "feliz";
//        }else if (acao.equals("vai dormir!")){
//            this.estadoDeEspirito = "Bravo";
//        }else if(acao.equals("pisar na patinha")){
//            this.estadoDeEspirito = "Triste";
//        }
//        else{
//            this.estadoDeEspirito = "Neutro";
//        }
        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

