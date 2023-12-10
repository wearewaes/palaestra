package com.waes.palaestra.romannumerals;

public class NumberTooSmall extends IllegalArgumentException {
    public NumberTooSmall() {
        super("Zero or negative number are not allowed");
    }
}
