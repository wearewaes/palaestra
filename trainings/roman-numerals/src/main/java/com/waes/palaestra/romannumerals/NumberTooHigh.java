package com.waes.palaestra.romannumerals;

public class NumberTooHigh extends RuntimeException {
    public NumberTooHigh() {
        super("Number is too large");
    }
}
