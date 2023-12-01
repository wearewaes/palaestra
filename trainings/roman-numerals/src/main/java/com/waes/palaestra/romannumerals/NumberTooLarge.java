package com.waes.palaestra.romannumerals;

public class NumberTooLarge extends RuntimeException {
    public NumberTooLarge() {
        super("Number is too large");
    }
}
