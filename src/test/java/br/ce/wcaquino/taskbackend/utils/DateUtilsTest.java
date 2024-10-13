package br.ce.wcaquino.taskbackend.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
public class DateUtilsTest {

    @Test
    public void deveRetornarTrueParaDataFuturas() {
        LocalDate date = LocalDate.of(2030, 01, 01);
        Assertions.assertTrue(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void deveRetornarFalseParaDataPassadas() {
        LocalDate date = LocalDate.of(2010, 01, 01);
        Assertions.assertFalse(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void deveRetornarTrueParaDataAtual() {
        LocalDate date = LocalDate.now();
        Assertions.assertTrue(DateUtils.isEqualOrFutureDate(date));
    }
}