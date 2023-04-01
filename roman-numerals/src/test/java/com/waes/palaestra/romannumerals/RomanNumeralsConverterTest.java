package com.waes.palaestra.romannumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RomanNumeralsConverterTest {

    @Test
    void given1expectsI() {
        assertEquals("I", RomanNumeralsConverter.convert(1));
    }
}