package com.waes.palaestra.balancedbraces;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class BalancedBracesVerifier {

    public boolean verify(String input) {

        var enclosings = Map.of(
            "[", "]",
            "(", ")",
            "{", "}"
        );

        var stack = new Stack<String>();

        for (var c : input.split("")) {
            if (!Set.of("[", "]",
                "(", ")",
                "{", "}").contains(c)) {
                continue;
            }
            if (enclosings.containsKey(c)) {
                stack.push(c);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }

            var closing = enclosings.get(stack.peek());
            if (c.equals(closing)) {
                stack.pop();
                continue;
            }

            return false;
        }

        return stack.isEmpty();
    }


}
