import java.util.Scanner;

public class PF101LabExer12 {

    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);

        System.out.print("Enter positive integer: ");
        double a = INPUT.nextInt();

        System.out.println("The Harmonic Sum is: " + harmonicSum(a));
        System.out.println("The Geometric Sum is: " + geometricSum(a));
    }

    static double harmonicSum(double value) {
        double total = 0;
        for (double i = 1; i <= value; i++) {
            total += (1 / i);
            // System.out.println(total);
        }

        return total;
    }

    static double geometricSum(double value) {
        double total = 0;
        for (double i = 1; i <= value; i++) {
            total += (1 / (Math.pow(2, i)));
        }

        return total;
    }
}
