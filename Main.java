public class Main {
    public static void main(String[] args) {
        myUtils myUtils = new myUtils();
        Dog Rayne = new Dog();

        Rayne.color = "Gray, White, and Black";
        Rayne.eyeColor = "Blue, and Brown";
        Rayne.height = 18;
        Rayne.length = 36;
        Rayne.weight = 30;

        myUtils.clear();
        Rayne.showDetails();
    }
}
