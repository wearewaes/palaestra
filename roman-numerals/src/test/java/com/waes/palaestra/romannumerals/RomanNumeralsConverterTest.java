package com.waes.palaestra.romannumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RomanNumeralsConverterTest {

    @Test
    void given1expectsI() {
        assertEquals("I", RomanNumeralsConverter.convert(1));
    }

    @Test
    void given2expectsII() {
        assertEquals("II", RomanNumeralsConverter.convert(2));
    }
}