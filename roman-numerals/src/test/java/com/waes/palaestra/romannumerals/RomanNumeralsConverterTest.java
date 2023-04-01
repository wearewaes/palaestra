package com.waes.palaestra.romannumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanNumeralsConverterTest {

    @ParameterizedTest
    @CsvSource({
        "1, I",
        "2, II",
        "3, III",
    })
    void shouldConvertCorrectlyWithOnlySymbolI(int numberToTest, String expectedRoman) {
        assertEquals(expectedRoman, RomanNumeralsConverter.convert(numberToTest));
    }

    @Test
    void given4expectsIV() {
        assertEquals("IV", RomanNumeralsConverter.convert(4));
    }

    @Test
    void given5expectsV() {
        assertEquals("V", RomanNumeralsConverter.convert(5));
    }

    @Test
    void given6expectsVI() {
        assertEquals("VI", RomanNumeralsConverter.convert(6));
    }

    @Test
    void given7expectsVII() {
        assertEquals("VII", RomanNumeralsConverter.convert(7));
    }

    @Test
    void given8expectsVIII() {
        assertEquals("VIII", RomanNumeralsConverter.convert(8));
    }
}