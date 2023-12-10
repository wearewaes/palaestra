package com.waes.palaestra.romannumerals;

import static java.util.Arrays.stream;

public class RomanNumeralsConverter {
    private static final int MIN = 1;
    private static final int MAX = 4999;

    public RomanNumeral convert(int cardinal) {
        if (cardinal < MIN) {
            throw new NumberTooSmall();
        }
        if (cardinal > MAX) {
            throw new NumberTooLarge();
        }

        return new RomanNumeral(
            stream(RomanSymbol.values())
                .reduce(new CardinalAndRoman(cardinal, ""), this::transform, (a, b) -> a)
                .roman
        );
    }

    private record CardinalAndRoman(int cardinal, String roman) {}

    private CardinalAndRoman transform(CardinalAndRoman accumulator, RomanSymbol symbol) {
        if (accumulator.cardinal < symbol.weight) {
            return accumulator;
        }
        return transform(
            new CardinalAndRoman(
                accumulator.cardinal - symbol.weight,
                accumulator.roman + symbol.name()
            ),
            symbol
        );
    }
}
