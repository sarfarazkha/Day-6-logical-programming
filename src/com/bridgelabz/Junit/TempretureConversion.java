package com.bridgelabz.Junit;

import java.util.Scanner;

public class TempretureConversion {
    public static void fahrenheitC(double celsius) {

        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println(fahrenheit);
    }

    public static void celsiusC(double fahrenheit) {

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(celsius);
    }

    public static void main(String[] args) {
        System.out.println("Choose Conversion\r\t1)Fahrenheit to celsious \r\t" + "2)Celsius to Fahrenheit");
        Scanner scanner = new Scanner(System.in);

        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Enter the Fahrenheit value to convert to celsius");
                double fahrenheit = scanner.nextInt();
                celsiusC(fahrenheit);
                break;
            case 2:
                System.out.println("Enter the Celsius value to convert to Fahrenheit");
                double celsious = scanner.nextInt();
                fahrenheitC(celsious);
                break;
            default:
                System.out.println("invalid input");
                scanner.close();
                break;
        }

    }
}
