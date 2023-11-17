package com.waes.palaestra.romannumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RomanNumeralsConverterTest {

    @CsvSource({
        "1, I",
        "2, II",
        "3, III",
    })
    @ParameterizedTest
    void givenCardinalNumberLessThan4ShouldReturnEquivalentRomanNumberWithI(int cardinal, String expectedRoman) {
        assertEquals(expectedRoman, RomanNumeralsConverter.convert(cardinal));
    }

    @CsvSource({
        "10, X",
        "20, XX",
        "30, XXX",
    })
    @ParameterizedTest
    void givenCardinalTensLessThan40ShouldReturnEquivalentRomanNumberWithX(int cardinal, String expectedRoman) {
        assertEquals(expectedRoman, RomanNumeralsConverter.convert(cardinal));
    }

    @CsvSource({
        "100, C",
        "200, CC",
        "300, CCC",
    })
    @ParameterizedTest
    void givenCardinalHundredsLessThan400ShouldReturnEquivalentRomanNumberWithC(int cardinal, String expectedRoman) {
        assertEquals(expectedRoman, RomanNumeralsConverter.convert(cardinal));
    }

    @CsvSource({
        "1000, M",
        "2000, MM",
        "3000, MMM",
        "4000, MMMM",
    })
    @ParameterizedTest
    void givenCardinalThousandsShouldReturnEquivalentRomanNumberWithM(int cardinal, String expectedRoman) {
        assertEquals(expectedRoman, RomanNumeralsConverter.convert(cardinal));
    }

    @Test
    void givenCardinalNumber4333ShouldReturnEquivalentRomanNumberMMMMCCCXXXIII() {
        assertEquals("MMMMCCCXXXIII", RomanNumeralsConverter.convert(4333));
    }

    @CsvSource({
        "4, IV",
        "40, XL",
        "400, CD",
        "9, IX",
        "90, XC",
        "900, CM",
    })
    @ParameterizedTest
    void givenCardinalNumberMod4Or9AndMod10ShouldReturnEquivalentRomanNumberWithPreviousAndNext(int cardinal, String expectedRoman) {
        assertEquals(expectedRoman, RomanNumeralsConverter.convert(cardinal));
    }

    @CsvSource({
        "5, V",
        "50, L",
        "500, D",
    })
    @ParameterizedTest
    void givenCardinalNumberMod5AndMod10ShouldReturnEquivalentRomanNumberVLD(int cardinal, String expectedRoman) {
        assertEquals(expectedRoman, RomanNumeralsConverter.convert(cardinal));
    }

    @Test
    void givenCardinalNumberGreaterThan4999ShouldThrowError() {
        var exception = assertThrows(IllegalArgumentException.class, () -> RomanNumeralsConverter.convert(5000));
        assertEquals("Number greater than 4999 is not available", exception.getMessage());
    }
}