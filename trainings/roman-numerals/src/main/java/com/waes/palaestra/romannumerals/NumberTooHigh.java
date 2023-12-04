package com.waes.palaestra.romannumerals;

public class NumberTooHigh extends IllegalArgumentException {
    public NumberTooHigh() {
        super("Number is too large");
    }
}
