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

    @ParameterizedTest
    @CsvSource({
        "4, IV",
        "5, V",
        "6, VI",
        "7, VII",
        "8, VIII",
    })
    void shouldConvertCorrectlyWithSymbolV(int numberToTest, String expectedRoman) {
        assertEquals(expectedRoman, RomanNumeralsConverter.convert(numberToTest));
    }

    @ParameterizedTest
    @CsvSource({
        "9, IX",
        "10, X",
        "11, XI",
        "12, XII",
        "13, XIII",
        "14, XIV",
        "15, XV",
        "16, XVI",
        "17, XVII",
        "18, XVIII",
        "19, XIX",
    })
    void shouldConvertCorrectlyWithSymbolX(int numberToTest, String expectedRoman) {
        assertEquals(expectedRoman, RomanNumeralsConverter.convert(numberToTest));
    }
}