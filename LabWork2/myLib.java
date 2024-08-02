package LabWork2;

public class myLib {
    // clears terminal
    public void clear() {
        System.out.print("\033[H\033[2J");
    }

    public boolean validEmail(String email) {
        if (email.contains("@") && email.contains(".com")) {
            return true;
        } else {
            return false;
        }
    }
}
