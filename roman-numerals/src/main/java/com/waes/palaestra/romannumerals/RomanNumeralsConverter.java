package com.waes.palaestra.romannumerals;

import static com.waes.palaestra.romannumerals.Symbol.*;

import java.util.List;

public class RomanNumeralsConverter {

    private static final List<Symbol> SYMBOLS = List.of(
        M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I
    );

    public static String convert(int number) {
        if (number < 1) throw new IllegalArgumentException("Number should be at least 1");

        var result = new StringBuilder();

        for (var symbol : SYMBOLS) {
            while (number >= symbol.value) {
                result.append(symbol.name());
                number-=symbol.value;
            }
        }

        return result.toString();
    }

}
