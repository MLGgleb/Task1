package org.example;

import javax.swing.*;

public class Task1_9 {
    public static void main(String[] args) {
        int[] mas = new int[args.length];
        for(int i = 0; i < args.length; ++i) {
            String s = args[i];
            int a = Integer.parseInt(s);
            mas[i] = a;
        }
        int S = sumOfCubes(mas);
        System.out.println(S);
    }
    public static int sumOfCubes(int[] mas) {
        int sum = 0;

        for(int i = 0; i < mas.length; ++i) {
            sum = (int)((double)sum + Math.pow((double)mas[i], 3.0));
        }

        return sum;
    }
}
