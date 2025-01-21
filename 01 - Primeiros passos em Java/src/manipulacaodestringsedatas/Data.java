package manipulacaodestringsedatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Data {
    public static void main(String[] args) {
        /*
            Funcionalidades
            * LocalDate: Representa uma data, sem incluir informações de hora ou fuso horário. Armazena ano, mês e dia.
            * LocalTime: Representa uma hora do dia, sem incluir informações de data ou fuso horário. Armazena horas, minutos, segundos e frações de segundo.
            * LocalDateTime: Combina data e hora em um único objeto, sem informações de fuso horário.
            * ZonadDateTime: Representa uma data e hora com informações de fuso horário.
            * Period: Representa um período de tempo entre duas datas, com precisão de dias, meses e anos.

            A empresa quer registrar a data de aniversário dos clientes para enviar
            ofertas especiais em seus aniversários. Precisa-se verificar se a data
            do evento ocorre antes ou depois de uma data especifica, como a data de hoje.
            Além de armazenar a data de nascimento do cliente,
            você precisa registrar a data e hora de cadastro no sistema
            (incluindo o fuso horário). Também é necessário calcular o período
            até o próximo aniversário do cliente para enviar uma mensagem personalizada.
         */

        //Cadastro do cliente
        LocalDate dataNascimento = LocalDate.of(1990, 5, 15);
        System.out.println("Data de nascimento do cliente: " + dataNascimento);

        //Data e hora do cadastro do cliente
        LocalDateTime dataHoraCadastro = LocalDateTime.now();
        System.out.println("Data e hora do cadastro: " + dataHoraCadastro);

        //Calcular o próximo aniversário do cliente
        LocalDate hoje = LocalDate.now();
        LocalDate proximoAniversario = dataNascimento.withYear(hoje.getYear());
        if(proximoAniversario.isBefore(hoje) || proximoAniversario.isEqual(hoje)){
            proximoAniversario = proximoAniversario.plusYears(1);
        }
        System.out.println("Próximo Aniversário do cliente: " + proximoAniversario);

        //Calcular o período até o próximo aniversário
        Period periodoAteAniversario = Period.between(hoje, proximoAniversario);
        System.out.println("Faltam " + periodoAteAniversario.getMonths() +
                " meses e " + periodoAteAniversario.getDays() + " dias para " +
                "o próximo aniversario");

        //Verificar se o aniversário é antes ou depois de um evento
        LocalDate dataEvento = LocalDate.of(2024, 10, 11);
        if(proximoAniversario.isAfter(dataEvento)){
            System.out.println("O aniversário do cliente é depois do evento");
        }
        else{
            System.out.println("O aniversário do cliente é antes ou no mesmo dia" +
                    " do evento");
        }
    }
}
