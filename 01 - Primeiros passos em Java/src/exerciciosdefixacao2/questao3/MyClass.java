package exerciciosdefixacao2.questao3;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o seu altura ");
        double altura = input.nextDouble();
        System.out.println("Informe o seu peso ");
        double peso = input.nextDouble();
        double imc = peso / altura * altura;
        System.out.printf("Seu imc eh %.2f \n", imc);
    }
}
