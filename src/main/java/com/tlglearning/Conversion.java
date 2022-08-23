package com.tlglearning;

public class Conversion {

    public static int convertToDecimal(String binary) {
        int value = 0;
        for (char c : binary.toCharArray()) {
            // multiplies value by 2
            value = (value << 1) + c- '0';
        }
        return value;
    }

    //@param representation
    //@param radix
    //@return
    //@throws IllegalArgumentException if {@code radix < 2 || radix > 10}
    public static int parse(String representation, int radix) throws IllegalArgumentException {
        int value = 0;
        for (char c : representation.toCharArray()) {
            // multiplies value by 2
            value = (value * radix) + c- '0';
        }
        return value;
    }

}
