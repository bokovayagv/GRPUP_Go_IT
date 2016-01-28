package com.finalproject.group12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {
    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException {
        boolean togle = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name;
        String number;

        while (togle){
            System.out.println("Enter number to call method \n" +
                    "1. Decimal to Binary\n" +
                    "2. Binary to Decimal\n" +
                    "0. Exit\n");
            name = reader.readLine();

            switch (name){
                case "1" :
                    System.out.println("Enter binary number to convert ");
                    number = reader.readLine();
                    System.out.println("Binary to Decimal is: " + Converter.binToDec(number));
                    break;
                case "2" :
                    System.out.println("Enter decimal number to convert ");
                    number = reader.readLine();
                    System.out.println("Decimal to Binary is " + Converter.decToBin(number));
                    break;
                case "0" :
                    togle = false;
                    break;
                default:
                    System.out.println("WRONG! Please enter valid number\n");
                    break;
            }

        }
    }
}
