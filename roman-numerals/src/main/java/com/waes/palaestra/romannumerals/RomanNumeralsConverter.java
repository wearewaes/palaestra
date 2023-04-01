package com.waes.palaestra.romannumerals;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralsConverter {

    private static final Map<Integer, String> SYMBOLS = new LinkedHashMap<>() {{
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public static String convert(int number) {
        var result = new StringBuilder();

        while (number >= 10) {
            result.append(SYMBOLS.get(10));
            number-=10;
        }

        if (number == 9) {
            result.append(SYMBOLS.get(9));
            number-=9;
        }

        if (number >= 5) {
            result.append(SYMBOLS.get(5));
            number-=5;
        }

        if (number == 4) {
            result.append(SYMBOLS.get(4));
            number-=4;
        }

        while (number >= 1) {
            result.append(SYMBOLS.get(1));
            number-=1;
        }

        return result.toString();
    }

}
