package operadoresbooleanoselogicos;

public class Main {
    public static void main(String[] args) {
        /*
            MATEMATICOS
            +   somar
            -   subtrair
            *   multiplicar
            /   dividir
            %   resto

            RELACIONAIS
            ==	igual
            !=	diferente
            >	maior
            <	menor
            >=	maior ou igual
            <=	menor ou igual

            LÓGICOS
            &&	E (AND)
            ||	OU (OR)
            !	NÃO (NOT)
         */

        int a = 10;
        int b = 20;

        int soma = a + b;          //30
        int subtracao = b - a;     //10
        int multiplicacao = a * b; //200
        int divisao = b / a;       //2
        int resto = b % a;         //0

        a+=b; //30
        boolean resultado = (a == b); //false
        boolean resultado2 = (a >= 10 && b > 10); //true
    }
}
