package com.waes.palaestra.balancedbraces;

import java.util.Map;
import java.util.Stack;

public class BalancedBracesVerifier {

    private static final Map<String, String> SYMBOLS = Map.of(
        "[", "]",
        "(", ")",
        "{", "}"
    );

    public boolean verify(String input) {

        var expectedClosingSymbols = new Stack<String>();

        for (var currentSymbol : input.split("")) {
            if (isOpeningSymbol(currentSymbol)) {
                expectedClosingSymbols.push(toClosingSymbol(currentSymbol));
            }

            if (isClosingSymbol(currentSymbol)) {
                if (expectedClosingSymbols.isEmpty()) {
                    return false;
                }

                if (!currentSymbol.equals(expectedClosingSymbols.pop())) {
                    return false;
                }
            }
        }

        return expectedClosingSymbols.isEmpty();
    }

    private boolean isOpeningSymbol(String symbol) {
        return SYMBOLS.containsKey(symbol);
    }

    private boolean isClosingSymbol(String symbol) {
        return SYMBOLS.containsValue(symbol);
    }

    private String toClosingSymbol(String symbol) {
        return SYMBOLS.get(symbol);
    }

}
