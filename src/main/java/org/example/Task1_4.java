package org.example;

public class Task1_4 {
    public static void main(String[] args) {
        String s = args[0];
        double prob = Double.parseDouble(s);
        String f = args[1];
        double prize = Double.parseDouble(f);
        String j = args[2];
        double pay = Double.parseDouble(j);
        System.out.println("результат: " + profitableGamble(prob, prize, pay));
    }
    public static boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize > pay;
    }

}
