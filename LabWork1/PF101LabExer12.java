package LabWork1;

import java.util.Scanner;

public class PF101LabExer12 {

    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);
        myLib.clear();

        System.out.print("Enter positive integer: ");
        double a = INPUT.nextInt();

        System.out.printf("\nThe Harmonic Sum is: %.2f", harmonicSum(a));
        System.out.printf("\nThe Geometric Sum is: %.2f\n\n", geometricSum(a));
    }

    static double harmonicSum(double value) {
        double total = 0;
        for (double i = 1; i <= value; i++) {
            total += (1 / i);
        }

        return total;
    }

    static double geometricSum(double value) {
        double total = 0;
        for (double i = 0; i <= value; i++) {
            total += (1 / (Math.pow(2, i)));
        }

        return total;
    }
}
