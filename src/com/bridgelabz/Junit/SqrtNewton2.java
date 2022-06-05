package com.bridgelabz.Junit;


public class SqrtNewton2 {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);// converting string to double
        double t = c;// initialize t = c
        double epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t) {// repeat until desired accuracy reached
            t = (c / t + t) / 2.0;// replace t with the average of c/t and t
        }
        System.out.println("Square root of " + c + " is " + t);

    }

}
