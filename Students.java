import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Students {
    String name, address, email, birthday, age, grade;

    public static void main(String[] args) throws IOException {
        myUtils myUtils = new myUtils();
        Students BSIT = new Students();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        myUtils.clear();
        System.out.print("Enter name: ");
        BSIT.name = reader.readLine();

        System.out.print("Enter address: ");
        BSIT.address = reader.readLine();

        System.out.print("Enter email: ");
        BSIT.email = reader.readLine();

        System.out.print("Enter birthday: ");
        BSIT.birthday = reader.readLine();

        System.out.print("Enter age: ");
        BSIT.age = reader.readLine();

        System.out.print("Enter grade: ");
        BSIT.grade = reader.readLine();

        System.out.println("\n\nName: " + BSIT.name);
        System.out.println("Address: " + BSIT.address);
        System.out.println("Email: " + BSIT.email);
        System.out.println("Birthday: " + BSIT.birthday);
        System.out.println("Age: " + Integer.parseInt(BSIT.age));
        System.out.println("Grade: " + Integer.parseInt(BSIT.grade));
    }
}
