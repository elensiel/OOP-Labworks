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
        displayArray(myArr);
        sumArray(myArr);
        averageArray(myArr);
        oddArray(myArr);
        evenArray(myArr);
        divbyFiveArray(myArr);
        highestArray(myArr);
        lowestArray(myArr);
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

    static void displayArray(int[] arr) {
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

    static void oddArray(int[] arr) {
        System.out.print("The odd number(s) in the array are ");

        // loop thru array
        for (int i = 0; i < arr.length; i++) {
            // check if odd
            if ((arr[i] % 2) != 0) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    static void evenArray(int[] arr) {
        System.out.print("The even number(s) in the array are ");

        // loop thru array
        for (int i = 0; i < arr.length; i++) {
            // check if even
            if ((arr[i] % 2) == 0) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    static void divbyFiveArray(int[] arr) {
        System.out.print("Divisible by 5 numbers in the array are ");

        // loop thru array
        for (int i = 0; i < arr.length; i++) {
            // check if div by 5
            if ((arr[i] % 5) == 0) {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    static void highestArray(int[] arr) {
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        System.out.println("The highest value in the array is " + maxValue);
    }

    static void lowestArray(int[] arr) {
        int minValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        System.out.println("The lowest value in the array is " + minValue);
    }
}
