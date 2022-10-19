package org.example;

public class Task1_5 {
    public static void main(String[] args) {
        String s = args[0];
        int N = Integer.parseInt(s);
        String f = args[1];
        int a = Integer.parseInt(f);
        String j = args[2];
        int b = Integer.parseInt(j);
        System.out.println(operation(N, a, b));
    }
    public static String operation(int N, int a, int b) {
        if (a + b == N) {
            return "added";
        } else if (a - b == N) {
            return "subtracted";
        } else if (a * b == N) {
            return "multiplied";
        } else if (a / b == N) {
            return "divided";
        } else {
            return "none";
        }
    }
}
