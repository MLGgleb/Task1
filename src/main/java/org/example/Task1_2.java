package org.example;

public class Task1_2 {
    public static void main(String[] args) {
        String s = args[0];
        double a = Double.parseDouble(s);
        String f = args[1];
        double b = Double.parseDouble(f);
        System.out.println("результат: " + triaArea(a, b));
    }
    public static double triaArea(double a, double b) {
        return a * b / 2;
    }
}
