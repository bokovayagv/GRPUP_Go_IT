package com.finalproject.group12;

public class Converter {

    private final static int BINARY = 2;
    public static final int DECIMAL = 10;

    public static String binToDec(final String bin) {
        return Integer.toString(Integer.parseInt(bin, BINARY));
    }

    public static String decToBin(final String dec) {
        return Integer.toString(Integer.parseInt(dec, DECIMAL), BINARY);
    }
}
