package Personas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Principal {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2002,6,5);
        LocalDate today = LocalDate.now();
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        System.out.printf("Tienes %d dias", p2);
    }
}
