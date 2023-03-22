package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RelaxServiceTest {

    @Test
    public void shouldRelaxMonths1() {
        int expected = 3;

        RelaxService service = new RelaxService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;


        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRelaxMonths2() {
        int expected = 2;

        RelaxService service = new RelaxService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;


        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}