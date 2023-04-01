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
        "13, XIII",
        "14, XIV",
        "16, XVI",
        "17, XVII",
        "21, XXI",
        "25, XXV",
        "28, XXVIII",
        "32, XXXII",
        "39, XXXIX",
    })
    void shouldConvertCorrectlyWithSymbolX(int numberToTest, String expectedRoman) {
        assertEquals(expectedRoman, RomanNumeralsConverter.convert(numberToTest));
    }

    @ParameterizedTest
    @CsvSource({
        "43, XLIII",
        "50, L",
        "54, LIV",
        "61, LXI",
        "75, LXXV",
        "89, LXXXIX",
    })
    void shouldConvertCorrectlyWithSymbolL(int numberToTest, String expectedRoman) {
        assertEquals(expectedRoman, RomanNumeralsConverter.convert(numberToTest));
    }

    @ParameterizedTest
    @CsvSource({
        "93, XCIII",
        "100, C",
        "104, CIV",
        "201, CCI",
        "255, CCLV",
        "399, CCCXCIX",
    })
    void shouldConvertCorrectlyWithSymbolC(int numberToTest, String expectedRoman) {
        assertEquals(expectedRoman, RomanNumeralsConverter.convert(numberToTest));
    }

    @ParameterizedTest
    @CsvSource({
        "403, CDIII",
        "500, D",
        "604, DCIV",
        "701, DCCI",
        "855, DCCCLV",
        "899, DCCCXCIX",
    })
    void shouldConvertCorrectlyWithSymbolD(int numberToTest, String expectedRoman) {
        assertEquals(expectedRoman, RomanNumeralsConverter.convert(numberToTest));
    }
}