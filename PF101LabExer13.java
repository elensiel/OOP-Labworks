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

        myArr = inputArray(myArr);

        displayArray(myArr);

        System.out.println("\nSum: " + sumArray(myArr));
        System.out.println("Average: " + averageArray(myArr));
        System.out.println("Odd elements: " + oddArray(myArr));
        System.out.println("Even elements: " + evenArray(myArr));
        System.out.println("Elements divisible by 5: " + divby5Array(myArr));
        System.out.println("Highest number: " + highestArray(myArr));
        System.out.println("Lowest number: " + lowestArray(myArr));
    }

    // clears terminal
    static void clear() {
        System.out.print("\033[H\033[2J");
    }

    // receives the array then
    // input loop thru array length
    // returns the new arr
    static int[] inputArray(int[] arr) {
        int[] tempArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            clear();
            System.out.print("Enter element " + i + ": ");
            tempArr[i] = INPUT.nextInt();
        }

        return tempArr;
    }

    static void displayArray(int[] arr) {
        clear();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index[" + i + "]: " + arr[i]);
        }
    }

    static int sumArray(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    static int averageArray(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum /= arr.length;
    }

    static String oddArray(int[] arr) {
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) != 0) {
                temp += String.valueOf(arr[i]) + " ";
            }
        }

        return temp;
    }

    static String evenArray(int[] arr) {
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 0) {
                temp += String.valueOf(arr[i]) + " ";
            }
        }

        return temp;
    }

    static String divby5Array(int[] arr) {
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 5) == 0) {
                temp += String.valueOf(arr[i]) + " ";
            }
        }

        return temp;
    }

    static int highestArray(int[] myArr) {
        int maxValue = myArr[0];
        for (int i = 1; i < myArr.length; i++) {
            if (myArr[i] > maxValue) {
                maxValue = myArr[i];
            }
        }

        return maxValue;
    }

    static int lowestArray(int[] myArr) {
        int minValue = myArr[0];
        for (int i = 1; i < myArr.length; i++) {
            if (myArr[i] < minValue) {
                minValue = myArr[i];
            }
        }

        return minValue;
    }
}
