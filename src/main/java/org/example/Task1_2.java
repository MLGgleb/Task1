package org.example;

public class Task1_2 {
    public static void main(String[] args) {
        String s = args[0];
        Double a = Double.parseDouble(s);
        String f = args[1];
        Double b = Double.parseDouble(f);
        System.out.println("результат: " + triaArea(a, b));
    }
    public static Double triaArea(Double a, Double b) {
        return a * b / 2;
    }
}
