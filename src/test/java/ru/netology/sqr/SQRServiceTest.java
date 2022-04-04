package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldCalculate(String test, int downLimit, int upLimit, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculate(downLimit, upLimit);
        assertEquals(expected, actual);
    }
}

