package manipulacaodestringsedatas;

public class Main {
    public static void main(String[] args) {
        /*
            Característica importante das Strings em Java: Imutabilidade

            Funcionalidades:
            * Concatenação de strings: Usando o operador '+' ou o método 'concat()'.
            * Obtenção do comprimento: 'length()'.
            * Divisão em substrings: 'split()'.
            * Busca por substrings: 'indexOf()' e 'lastIndexOf()'.
            * Extração de caracteres individuais: 'charAt()'.
            * Conversão entre maiúsculas e minúsculas: 'toUpperCase()' e 'toLowerCase()'.
            * Comparação de Strings: 'equals()' ou 'equalsIgnoreCase()'

            No sistema de cadastro, você precisa criar uma saudação
            personalizada para o cliente, informando o nome completo em
            letras maiúsculas, o número de caracteres no nome,
            e verificar se o nome digitado é igual ao de um cliente
            já cadastrado, ignorando o formato da escrita.
            Além disso, vamos fazer a separação do nome e sobrenome, a
            exibição da primeira letra do nome e a posição do sobrenome
         */

        String nomeDigitado = "Anderson Vieira";
        String nomeCadastrado = "Anderson vieira";

        // Comparação dos nomes
        boolean nomesIguais = nomeDigitado.equals(nomeCadastrado);
        System.out.println("Os nomes são exatamento iguais? " + nomesIguais);

        //Comparação ignorando maiúsculas e minúsculas
        boolean nomesIguaisIgnorandoMaiusculas = nomeDigitado.equalsIgnoreCase(nomeCadastrado);
        System.out.println("Os nomes são iguais ignorando maiúsculas? " + nomesIguaisIgnorandoMaiusculas);

        //Converter para letras maiúsculas
        String nomeMaiusculo = nomeDigitado.toUpperCase();
        System.out.println("Nome em maiúsculas: " + nomeMaiusculo);

        //Converter para letras minúsculas
        String nomeMinusculo = nomeDigitado.toLowerCase();
        System.out.println("Nome em minúsculas: " + nomeMinusculo);

        // Obter o tamanho da string
        int tamanhoNome = nomeDigitado.length();
        System.out.println("O nome contém " + tamanhoNome + " caracteres");

        //Saudação Personalizada
        String saudacao = "Bem Vindo, ".concat(nomeMaiusculo).concat("!");
        System.out.println(saudacao);

        //Obter a primeira letra do nome
        char primeiraLetra = nomeDigitado.charAt(0);
        System.out.println("A primeira letra do nome é " + primeiraLetra);

        //Encontrar a posição do sobrenome Vieira usando indexof
        int posicaoSobrenome = nomeDigitado.indexOf("Vieira");
        if(posicaoSobrenome != -1){
            System.out.println("O sobrenome Vieira começa na posição " + posicaoSobrenome);
        }
        else{
            System.out.println("Sobrenome Vieira não foi encontrado!");
        }

    }
}
