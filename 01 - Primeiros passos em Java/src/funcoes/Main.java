package funcoes;

public class Main {
    public static void main(String[] args) {
        /*
            CARACTERÍSTICAS IMPORTANTES DE MÉTODOS JAVA:

            - MODULARIDADE
            - REUTILIZAÇÃO DE CÓDIGO
            - ABSTRAÇÃO
            - PARÂMETROS E RETORNO
            - VISIBILIDADE
         */
        int resultado = soma(5,3);
        System.out.println("Resultado da soma: " + resultado);
    }
    public static int soma(int a, int b){
        return a+b;
    }

    public static double soma(double a, double b){
        return a+b;
    }

    public static int soma(int a, int b, int c){
        return a+b+c;
    }
}
