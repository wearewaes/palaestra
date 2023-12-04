package com.waes.palaestra.romannumerals;

public class NumberTooLow extends IllegalArgumentException {
    public NumberTooLow() {
        super("Zero or negative number are not allowed");
    }
}
