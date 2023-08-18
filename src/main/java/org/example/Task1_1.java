package org.example;

public class Task1_1 {
    public static void main(String[] args) {
        String s = args[0];
        int a = Integer.parseInt(s);
        String f = args[1];
        int b = Integer.parseInt(f);
        System.out.println("результат: " + remainder(a, b));
    }
    public static int remainder(int a, int b) {
        return a % b;
        return a;
    }
}