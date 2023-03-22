package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RelaxServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/relax.csv")
    public void shouldRelaxMonths1(int expected, int income, int expenses, int threshold) {

        RelaxService service = new RelaxService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}