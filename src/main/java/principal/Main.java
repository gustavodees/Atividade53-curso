package principal;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        DateTimeFormatter dtf4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter dtf5 = DateTimeFormatter.ISO_INSTANT;


        System.out.println("d01 = " + d01.format(dtf));
        System.out.println("d01 = " + dtf.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d02 = " + d02.format(dtf));
        System.out.println("d02 = " + d02.format(dtf2));
        System.out.println("d02 = " + d02.format(dtf4));
        System.out.println("d03 = " + dtf3.format(d03));
        System.out.println("d03 = " + dtf5.format(d03));





    }
}