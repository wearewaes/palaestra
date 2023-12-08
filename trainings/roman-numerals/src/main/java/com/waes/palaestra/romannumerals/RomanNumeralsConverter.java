package com.waes.palaestra.romannumerals;

import java.util.Arrays;

public class RomanNumeralsConverter {

    public RomanNumeral convert(int cardinalNumber) {
        if (cardinalNumber <= 0) {
            throw new NumberTooLow();
        }
        if (cardinalNumber >= 5000) {
            throw new NumberTooHigh();
        }

        var roman = Arrays.stream(RomanSymbol.values())
            .reduce(new Pair(cardinalNumber, ""), this::accumulate, (a, b) -> a);

        return new RomanNumeral(roman.roman);
    }

    record Pair(int cardinal, String roman) {}

    private Pair accumulate(Pair acc, RomanSymbol symbol) {
        if (acc.cardinal < symbol.weight) {
            return acc;
        }
        return accumulate(new Pair( acc.cardinal - symbol.weight, acc.roman + symbol.name()), symbol);
    }
}
