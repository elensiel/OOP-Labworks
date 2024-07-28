package LabWork3;

public class PF101LabExer32 {
    public static void main(String[] args) {
        int birthyear = 2002;
        int currentyear = 2024;
        int age = difference(currentyear, birthyear);

        System.out.println("Age: " + age);
        System.out.println("Current Year: " + sum(birthyear, age));
    }

    // SUMs
    public static int sum(int x, int y) {
        return x + y;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    // DIFFs
    public static int difference(int x, int y) {
        return x - y;
    }

    public static double difference(double x, double y) {
        return x - y;
    }
}
