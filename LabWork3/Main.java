package LabWork3;

import LabWork1.myLib;

public class Main {
    public static void main(String[] args) {
        Dog Rayne = new Dog();

        Rayne.name = "Rayne";
        Rayne.color = "Gray, White, and Black";
        Rayne.eyeColor = "Blue, and Brown";
        Rayne.height = 18;
        Rayne.length = 36;
        Rayne.weight = 30;

        myLib.clear();
        Rayne.showDetails();
    }
}
