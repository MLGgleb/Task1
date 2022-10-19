package org.example;

public class Task1_10 {
    public static void main(String[] args) {
        String s = args[0];
        int a = Integer.parseInt(s);
        String f = args[1];
        int b = Integer.parseInt(f);
        String j = args[2];
        int c = Integer.parseInt(j);
        System.out.println(abcmath(a, b, c));
    }
    public static boolean abcmath(int a, int b, int c) {
        int sum = a;
        for(int i = 1; i <= b; ++i) {
            sum += sum;
        }
        return sum % c == 0;
    }
}
