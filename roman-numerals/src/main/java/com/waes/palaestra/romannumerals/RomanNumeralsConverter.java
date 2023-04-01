package com.waes.palaestra.romannumerals;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralsConverter {

    private static final Map<Integer, String> SYMBOLS = new LinkedHashMap<>() {{
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public static String convert(int number) {
        var result = new StringBuilder();

        for (var entry : SYMBOLS.entrySet()) {
            var weight = entry.getKey();
            var letter = entry.getValue();

            while (number >= weight) {
                result.append(letter);
                number-=weight;
            }
        }

        return result.toString();
    }

}
