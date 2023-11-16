package com.waes.palaestra.fizzbuzz;

public class FizzBuzz {

    public static String calculate(int number) {
        if (number <= 0) throw new IllegalArgumentException("Number equal/smaller than 0 is not allowed");
        if (isDivisible(number, 15)) return "FizzBuzz";
        if (isDivisible(number, 5)) return "Buzz";
        if (isDivisible(number, 3)) return "Fizz";
        return String.valueOf(number);
    }

    private static boolean isDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}
