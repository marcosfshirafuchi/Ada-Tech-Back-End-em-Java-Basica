package estruturascondicionais;

public class Main {
    public static void main(String[] args) {
        /*
            if (condição = v){
	            executar um bloco de código
            }
            else{
	            executar outro bloco de código
            }
         */
        int nota = 6;
        if (nota >= 6){
            System.out.println("Aluno está aprovado");
        }else if( nota >= 5 && nota < 6){
            System.out.println("Aluno está em prova final");
        }else{
            System.out.println("Aluno está reprovado");
        }

    }
}
