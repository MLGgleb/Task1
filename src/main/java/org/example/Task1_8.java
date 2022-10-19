package org.example;

public class Task1_8 {
    public static void main(String[] args) {
        String s = args[0];
        int a = Integer.parseInt(s);
        String f = args[1];
        int b = Integer.parseInt(f);
        System.out.println(nextEdge(a, b));
    }
    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }

}
