package LabWork2;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Students {
    String lastName, firstName;
    String address, email, birthday, age, grade;

    public static void main(String[] args) throws IOException {
        myLib myLib = new myLib();
        Students BSIT = new Students();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        myLib.clear();
        System.out.print("Enter last name: ");
        BSIT.lastName = reader.readLine().trim();

        System.out.print("Enter first name: ");
        BSIT.firstName = reader.readLine().trim();

        System.out.print("Enter address: ");
        BSIT.address = reader.readLine();

        while (true) {
            System.out.print("Enter email: ");
            BSIT.email = reader.readLine();

            if (myLib.validEmail(BSIT.email) == true) {
                break;
            } else {
                System.out.println("\nMust contain \'@example.com\'\n");
                continue;
            }
        }

        System.out.println("Format: MM/DD/YYYY\n");
        System.out.print("Enter birthday: ");
        BSIT.birthday = reader.readLine();

        System.out.print("Enter age: ");
        BSIT.age = reader.readLine();

        System.out.print("Enter grade: ");
        BSIT.grade = reader.readLine();

        myLib.clear();
        System.out.println("Name: " + BSIT.lastName + ", " + BSIT.firstName);
        System.out.println("Address: " + BSIT.address);
        System.out.println("Email: " + BSIT.email);
        System.out.println("Birthday: " + BSIT.birthday);
        System.out.println("Age: " + Integer.parseInt(BSIT.age));
        System.out.println("Grade: " + Integer.parseInt(BSIT.grade));
    }
}
