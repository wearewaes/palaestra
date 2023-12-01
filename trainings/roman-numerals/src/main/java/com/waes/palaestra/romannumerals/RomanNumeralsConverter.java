package com.waes.palaestra.romannumerals;

public class RomanNumeralsConverter {

    public RomanNumeral convert(int cardinalNumber) {
        if (cardinalNumber <= 0) {
            throw new NumberTooLow();
        }
        if (cardinalNumber >= 5000) {
            throw new NumberTooHigh();
        }

        var result = new StringBuilder();
        for (var symbol: RomanSymbol.values()) {
            while (cardinalNumber >= symbol.weight) {
                result.append(symbol.name());
                cardinalNumber -= symbol.weight;
            }
        }
        return new RomanNumeral(result.toString());
    }
}
