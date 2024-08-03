package LabWork3;

public class Dog {
    String name, color, eyeColor;
    byte height, length;
    short weight;

    public void showDetails() {
        System.out.println("Dog Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Eye Color: " + eyeColor);
        System.out.println("Height: " + height + " Inches");
        System.out.println("Length: " + length + " Inches");
        System.out.println("Weight: " + weight + " Pounds");
    }
}
