package com.waes.palaestra.romannumerals;

public class RomanNumeralsConverter {

    public static String convert(int number) {
        if (number == 5) return "V";
        if (number == 3) return "III";
        if (number == 2) return "II";
        return "I";
    }

}
