import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Main{

    public static void main(String[] args){

        // (AGORA) -> Data-Hora
        LocalDate date1 = LocalDate.now();
        LocalDateTime date2 = LocalDateTime.now();
        Instant date3 = Instant.now();



        // Texto ISO 8601 -> Data-Hora
        LocalDate date4 = LocalDate.parse("2020-08-03");
        LocalDateTime date5 = LocalDateTime.parse("2020-08-03T12:05:41");
        Instant date6 = Instant.parse("2020-08-01T01:15:56Z");


        // Texto formatado -> Data-hora (DateTimeFormatter pode ser chamado fora da instanciação do objeto, atribuindo a sua instanciação)
        LocalDateTime data8 = LocalDateTime.parse("12/12/2004 07:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));


        // dia, mês, ano [horario] -> Data-hora
        LocalDate data9 = LocalDate.of(2004,12,12);
        LocalDateTime data10 = LocalDateTime.of(2004,12,12,7,30);


        // tipos de formatos de Data-hora -> TEXTOS (as Strings (Textos) podem ser padroes ou personalizado)
        DateTimeFormatter formato0 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("Europe/London")); // converte o proprio horario UTC padrão para ele mesmo (Europe/London)
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");                                                   // DateTimeFormatter não consegue formatar um Instant padrão porque PRECISA de um fuso horario para funcionar.
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // converter horario UTC para horario atual padrão do servidor.
        DateTimeFormatter formato4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("Asia/Seoul")); // converter horario UTC para horario atual Coreano (Asia/Seoul).
        DateTimeFormatter formato5 = DateTimeFormatter.ISO_INSTANT; // mesma coisa do objeto instanciado pelo Instant
        // A diferença está em como o objeto é chamado.



        System.out.println("DATA ATUAL: "+date1);
        System.out.println("HORARIO ATUAL: "+date2);
        System.out.println("DATA ATUAL FUSO HORARIO GMT: "+date3);
        System.out.println();

        System.out.println("DATA STRING: "+date4);
        System.out.println("HORARIO STRING: "+date5);
        System.out.println("DATA FUSO HORARIO GMT STRING: "+date6);
        System.out.println();

        System.out.println("DATA formatada (data fonte: formato = dd/MM/yyyy HH:mm): "+data8);
        System.out.println();

        System.out.println("DATA DIGITALIZADA: "+data9);
        System.out.println("DATA HORA DIGITALIZADA: "+data10);
        System.out.println();

        System.out.println("STRING FORMATADA PARA -> DATA-HORA");
        System.out.println("DATA ATUAL: "+date1.format(formato1));
        System.out.println("DATA E HORA ATUAL: "+date2.format(formato2));
        System.out.println("DATA E HORA ATUAL PADRÃO UTC: "+formato0.format(date3));
        System.out.println("DATA E HORA ATUAL Asia/Seoul: "+formato4.format(date3));
        System.out.println("DATA E HORA ATUAL UTC (ISO.INSTANT): "+formato5.format(date3));
        System.out.println();
        System.out.println("FORMATANDO HORARIO UTC PADRAO PARA HORARIO LOCAL");
        System.out.println(formato3.format(date3));

        System.out.println();
        System.out.println();





    }
}