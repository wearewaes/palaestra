package com.waes.palaestra.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 21})
    void givenMultipleOf3ShouldReturnFizz(int multipleOf3) {
        assertEquals("Fizz", FizzBuzz.calculate(multipleOf3));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    void givenMultipleOf5ShouldReturnBuzz(int multipleOf5) {
        assertEquals("Buzz", FizzBuzz.calculate(multipleOf5));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7})
    void givenNonMultipleOf3AndOr5ShouldReturnTheNumber(int non3or5Multiple) {
        assertEquals(String.valueOf(non3or5Multiple), FizzBuzz.calculate(non3or5Multiple));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void givenMultipleOf3And5ShouldReturnFizzBuzz(int multiple3And5) {
        assertEquals("FizzBuzz", FizzBuzz.calculate(multiple3And5));
    }

    @Test
    void givenZeroShouldRaiseException() {
        var exception = assertThrows(IllegalArgumentException.class, () -> FizzBuzz.calculate(0));
        assertEquals("Number equal/smaller than 0 is not allowed", exception.getMessage());
    }

    @Test
    void givenNegativeNumberShouldRaiseException() {
        var exception = assertThrows(IllegalArgumentException.class, () -> FizzBuzz.calculate(-3));
        assertEquals("Number equal/smaller than 0 is not allowed", exception.getMessage());
    }
}