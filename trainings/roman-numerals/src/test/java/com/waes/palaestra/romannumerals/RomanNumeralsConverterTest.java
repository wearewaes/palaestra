package com.waes.palaestra.romannumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class RomanNumeralsConverterTest {

    @ParameterizedTest(name = "{index} => {0} should be {1}")
    @CsvSource({
        "1, I",
        "2, II",
        "3, III",
    })
    void shouldConvertCorrectlyWithOnlySymbolI(int numberToTest, String expectedRoman) {
        assertEquals(new RomanNumeral(expectedRoman), RomanNumeralsConverter.convert(numberToTest));
    }

    @ParameterizedTest(name = "{index} => {0} should be {1}")
    @CsvSource({
        "4, IV",
        "5, V",
        "6, VI",
        "7, VII",
        "8, VIII",
    })
    void shouldConvertCorrectlyWithSymbolV(int numberToTest, String expectedRoman) {
        assertEquals(new RomanNumeral(expectedRoman), RomanNumeralsConverter.convert(numberToTest));
    }

    @ParameterizedTest(name = "{index} => {0} should be {1}")
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
        assertEquals(new RomanNumeral(expectedRoman), RomanNumeralsConverter.convert(numberToTest));
    }

    @ParameterizedTest(name = "{index} => {0} should be {1}")
    @CsvSource({
        "43, XLIII",
        "50, L",
        "54, LIV",
        "61, LXI",
        "75, LXXV",
        "89, LXXXIX",
    })
    void shouldConvertCorrectlyWithSymbolL(int numberToTest, String expectedRoman) {
        assertEquals(new RomanNumeral(expectedRoman), RomanNumeralsConverter.convert(numberToTest));
    }

    @ParameterizedTest(name = "{index} => {0} should be {1}")
    @CsvSource({
        "93, XCIII",
        "100, C",
        "104, CIV",
        "201, CCI",
        "255, CCLV",
        "399, CCCXCIX",
    })
    void shouldConvertCorrectlyWithSymbolC(int numberToTest, String expectedRoman) {
        assertEquals(new RomanNumeral(expectedRoman), RomanNumeralsConverter.convert(numberToTest));
    }

    @ParameterizedTest(name = "{index} => {0} should be {1}")
    @CsvSource({
        "403, CDIII",
        "500, D",
        "604, DCIV",
        "701, DCCI",
        "855, DCCCLV",
        "899, DCCCXCIX",
    })
    void shouldConvertCorrectlyWithSymbolD(int numberToTest, String expectedRoman) {
        assertEquals(new RomanNumeral(expectedRoman), RomanNumeralsConverter.convert(numberToTest));
    }

    @ParameterizedTest(name = "{index} => {0} should be {1}")
    @CsvSource({
        "903, CMIII",
        "1000, M",
        "2604, MMDCIV",
        "2701, MMDCCI",
        "3855, MMMDCCCLV",
        "4000, MMMM",
    })
    void shouldConvertCorrectlyWithSymbolM(int numberToTest, String expectedRoman) {
        assertEquals(new RomanNumeral(expectedRoman), RomanNumeralsConverter.convert(numberToTest));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -10, -35, -9876})
    void shouldExceptionWhenNumberIsZeroOrLower(int number) {
        var exception = assertThrows(NumberTooLow.class, () -> RomanNumeralsConverter.convert(number));
        assertEquals("Zero or negative number are not allowed", exception.getMessage());
    }

    @ParameterizedTest
    @ValueSource(ints = {5000, 6543, 5001, 1231263})
    void shouldExceptionWhenNumberIs5000OrHigher(int number) {
        var exception = assertThrows(NumberTooHigh.class, () -> RomanNumeralsConverter.convert(number));
        assertEquals("Number is too large", exception.getMessage());
    }

    //TODO Make Symbols enum have unique symbols only and no combinations work around
    //TODO Refactor code into "functional-like" style
    //TODO Return Result[Success|Failure] instead of throwing exceptions
}