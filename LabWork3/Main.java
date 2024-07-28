package LabWork3;

public class Main {
    public static void main(String[] args) {
        myLib myLib = new myLib();
        Dog Rayne = new Dog();

        Rayne.color = "Gray, White, and Black";
        Rayne.eyeColor = "Blue, and Brown";
        Rayne.height = 18;
        Rayne.length = 36;
        Rayne.weight = 30;

        myLib.clear();
        Rayne.showDetails();
    }
}
