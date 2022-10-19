package org.example;

public class Task1_4 {
    public static void main(String[] args) {
        String s = args[0];
        Double prob = Double.parseDouble(s);
        String f = args[1];
        Double prize = Double.parseDouble(f);
        String j = args[2];
        Double pay = Double.parseDouble(j);
        System.out.println("результат: " + profitableGamble(prob, prize, pay));
    }
    public static boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize > pay;
    }

}
