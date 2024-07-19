import java.util.Scanner;

public class PF101LabExer13 {
    public static Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        clear();

        // get length of array
        System.out.print("Enter length of array: ");
        byte arrlength = INPUT.nextByte();
        INPUT.nextLine();

        // initialize array
        int myArr[] = new int[arrlength];

        inputArray(myArr);
        dispayArray(myArr);
        sumArray(myArr);
        averageArray(myArr);
    }

    // clears terminal
    static void clear() {
        System.out.print("\033[H\033[2J");
    }

    static void inputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            clear();
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = INPUT.nextInt();
        }
    }

    static void dispayArray(int[] arr) {
        clear();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sumArray(int[] arr) {
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            temp += arr[i];
        }

        System.out.println("\nThe sum of your array is " + temp);
    }

    static void averageArray(int[] arr) {
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            temp += arr[i];
        }

        System.out.println("The average of your array is " + (temp / arr.length));
    }
}
