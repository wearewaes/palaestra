package com.waes.palaestra.romannumerals;

public class RomanNumeralsConverter {

    enum Symbols {
        M(1000),
        CM(900),
        D(500),
        CD(400),
        C(100),
        XC(90),
        L(50),
        XL(40),
        X(10),
        IX(9),
        V(5),
        IV(4),
        I(1);

        final int weight;

        Symbols(int weight) {
            this.weight = weight;
        }
    }

    public static String convert(int cardinalNumber) {
        var result = new StringBuilder();
        for (var symbol:Symbols.values()) {
            while (cardinalNumber >= symbol.weight) {
                result.append(symbol.name());
                cardinalNumber -= symbol.weight;
            }
        }
        return result.toString();
    }
}
