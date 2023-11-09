package com.waes.palaestra.fizzbuzz;

public class FizzBuzz {

    public static String calculate(int number) {
        if (number <= 0) throw new IllegalArgumentException("Number equal/smaller than 0 is not allowed");
        if (number % 15 == 0) return "FizzBuzz";
        if (number % 5 == 0) return "Buzz";
        if (number % 3 == 0) return "Fizz";
        return String.valueOf(number);
    }
}
