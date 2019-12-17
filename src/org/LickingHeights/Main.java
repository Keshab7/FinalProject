package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       fahrenheitToCelsius();
    }
    public static void fahrenheitToCelsius() {
        Scanner keyboard;
        double Fahrenheit;
        double Celsius;
        keyboard = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Give me a Fahrenheit value");
            Fahrenheit = keyboard.nextDouble();
            Celsius = (Fahrenheit - 32) / 1.8;
            System.out.println(Fahrenheit+" Degrees Fahrenheit is " + Celsius +  " Degrees Celsius" );
        }
    }
}
