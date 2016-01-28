package com.finalproject.group12;

import org.junit.Test;

import static org.junit.Assert.*;


public class ConverterTest {

    @Test
    public void testDecToBin() throws Exception {
        String expected = "1111";
        assertEquals(expected, Converter.decToBin("15"));
    }

    @Test
    public void testBinToDec() throws Exception {
        String expected = "2";
        assertEquals(expected, Converter.binToDec("10"));
    }
}