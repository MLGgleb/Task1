package org.example;

public class Task1_7 {
    public static void main(String[] args) {
        String s = args[0];
        int a = Integer.parseInt(s);
        System.out.println("сумма: " + addUpTo(a));
    }
    public static int addUpTo(int a) {
        int sum = 0;
        for(int i = 1; i <= a; ++i) {
            sum += i;
        }
        return sum;
    }
}
