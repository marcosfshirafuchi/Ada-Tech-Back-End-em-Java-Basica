package tratamentodeexcecoes;

public class Main {
    public static void main(String[] args) {
        /*
            TRATAMENTO DE ERRO
            - Exceções
            - Bloco try-catch

            try{
            // código a ser executado e verificado se haverá exceção
            }
            catch{
            // tratamento de erro a ser executado
            }
            finally{
            // códigos que serão sempre executadostia
            }
         */
        try{
            int resultado = dividir(10,0);
            System.out.println("Resultado: " + resultado);
        }catch(ArithmeticException e){
            System.out.println("Erro: divisão por zero.");
        }finally{
            System.out.println("Bloco finally sendo executado");
        }
    }

    public static int dividir(int a, int b){
        return a / b;
    }
}
