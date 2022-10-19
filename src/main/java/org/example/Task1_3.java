package org.example;

public class Task1_3 {
    public static void main(String[] args) {
        String s = args[0];
        int a = Integer.parseInt(s);
        String f = args[1];
        int b = Integer.parseInt(f);
        String j = args[2];
        int c = Integer.parseInt(j);
        System.out.println("результат: " + animals(a, b, c));
    }
    public static int animals(int a, int b, int c) {
        return a * 2 + b * 4 + c * 4;
    }
}
