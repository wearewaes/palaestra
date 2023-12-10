package com.waes.palaestra.romannumerals;

public class NumberTooLarge extends IllegalArgumentException {
    public NumberTooLarge() {
        super("Number is too large");
    }
}
