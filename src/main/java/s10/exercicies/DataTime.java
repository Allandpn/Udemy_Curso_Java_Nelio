package s10.exercicies;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataTime {
    public static void main(String args[]){

        // INSTANCIACAO DE DATAS
        LocalDate horaLocal = LocalDate.now();
        System.out.println("Hora local: " + horaLocal);

        LocalDateTime horaLocalTime = LocalDateTime.now();
        System.out.println("Hora local: " + horaLocalTime);

        Instant instant = Instant.now();
        System.out.println("Instant: " + instant);

        LocalDate horaLocalParse = LocalDate.parse("2025-12-09");
        System.out.println("HOra local Parse: " + horaLocalParse);

        Instant instantParse = Instant.parse("2025-12-09T09:00:00.5532Z");
        System.out.println("Instant Parse: " + instantParse);

        DateTimeFormatter formater1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formater2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate localDateFormat1 = LocalDate.parse("22/04/2025", formater1);
        LocalDateTime localDateFormat2 = LocalDateTime.parse("22/04/2025 08:56", formater2);

        System.out.println("Hora formatada1 : " + localDateFormat1);
        System.out.println("Hora formatada2 : " + localDateFormat2);

        LocalDate horaLocalof = LocalDate.of(2025, 12, 10);
        System.out.println("horalocalof: " + horaLocalof);

        LocalDateTime horalocaltimeof = LocalDateTime.of(2025, 12, 11, 12, 10, 12, 21331);
        System.out.println("Hora local time of: "+ horalocaltimeof);


        //FORMATACAO DE DATAS
        DateTimeFormatter formater3 = DateTimeFormatter.ofPattern("d MMMM yyyy");

        System.out.println("HoraLocalFormatada1: " + formater3.format(horaLocalTime));
        System.out.println("HoraLocalFormatada2: " + horaLocalTime.format(formater3));
        System.out.println("HoraLocalFormatada3: " + horaLocalTime.format(DateTimeFormatter.ofPattern("dd MMM yy")));
        System.out.println("HoraLocalFormatada4: " + horaLocalTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("HoraLocalFormatada5: " + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()).format(instant));
        System.out.println("HoraLocalFormatad6: " + horaLocalTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("HoraLocalFormatad7: " + DateTimeFormatter.ISO_INSTANT.format(instant));


        //CONVERTER DATA GLOBAL PARA LOCAL

        LocalDate horaLocalConvertida = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        LocalDateTime horaLocalJapao = LocalDateTime.ofInstant(instant, ZoneId.of("Japan"));
        System.out.println("Hora Local convertida: " + horaLocalConvertida);
        System.out.println("Hora Local Japao: " + horaLocalJapao);

        System.out.println("Hora Japao: " + horaLocalJapao.getHour());
        System.out.println("Dia Japao: " + horaLocalJapao.getDayOfMonth());


        //OPERACOES COM DATA HORA
        LocalDate horaLocalLastWeak = horaLocal.minusWeeks(1);
        LocalDate horaLocalNextWeak = horaLocal.plusWeeks(1);

        System.out.println("Hora local last week: "+ horaLocalLastWeak);
        System.out.println("Hora local next week: "+ horaLocalNextWeak);

        Instant instantLastWeek = instant.minus(7, ChronoUnit.DAYS);
        Instant instantNextWeek = instant.plus(7, ChronoUnit.DAYS);

        System.out.println("Instant last week: " + instantLastWeek);
        System.out.println("Instant next week: " + instantNextWeek);

        Duration duration = Duration.between(instantLastWeek, instantNextWeek);

        System.out.println("Duration: " + duration.toDays());

        Duration duration2 = Duration.between(horaLocalLastWeak.atStartOfDay(), horaLocalNextWeak.atStartOfDay());

        System.out.println("Duration 2: " + duration2.toDays());

    }
}
