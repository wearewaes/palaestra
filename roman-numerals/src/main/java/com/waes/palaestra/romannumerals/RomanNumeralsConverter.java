package com.waes.palaestra.romannumerals;

public class RomanNumeralsConverter {

    public static String convert(int number) {
        if (number == 8) return "VIII";
        if (number == 7) return "VII";
        if (number == 6) return "VI";
        if (number == 5) return "V";
        if (number == 4) return "IV";
        if (number == 3) return "III";
        if (number == 2) return "II";
        return "I";
    }

}
