package com.waes.palaestra.romannumerals;

import static com.waes.palaestra.romannumerals.Symbol.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralsConverter {

    private static final Map<Integer, Symbol> SYMBOLS = new LinkedHashMap<>() {{
        put(1000, M);
        put(900, CM);
        put(500, D);
        put(400, CD);
        put(100, C);
        put(90, XC);
        put(50, L);
        put(40, XL);
        put(10, X);
        put(9, IX);
        put(5, V);
        put(4, IV);
        put(1, I);
    }};

    public static String convert(int number) {
        if (number < 1) throw new IllegalArgumentException("Number should be at least 1");

        var result = new StringBuilder();

        for (var entry : SYMBOLS.entrySet()) {
            var weight = entry.getKey();
            var letter = entry.getValue().name();

            while (number >= weight) {
                result.append(letter);
                number-=weight;
            }
        }

        return result.toString();
    }

}
