
public class MainProgram {
    public static void main(String[] args) {
        myUtils myUtils = new myUtils();
        Lot objLot = new Lot();
        Lot objLot1 = new Lot();
        Lot objLot2 = new Lot();

        myUtils.clear();
        System.out.println("Lot's address: " + objLot.address);
        System.out.println("Owner's Full name: " + objLot.ownerFirstName + " " + objLot.ownerLastName);
        System.out.println("Lot Area: " + (objLot.lotLength * objLot.lotWidth));

        System.out.println("\nOld Lot Area: " + (objLot.lotLength * objLot.lotWidth));
        objLot.lotLength = 10;
        System.out.println("New Lot Area: " + (objLot.lotLength * objLot.lotWidth));

        objLot.address = "Cabuyao, Laguna";
        System.out.println("\nLot's address: " + objLot.address);

        objLot.ownerFirstName = "John";
        objLot.ownerLastName = "Jones";
        System.out.println("\nHello " + objLot.ownerFirstName + "!");

        objLot.lotWidth = 8;
        System.out.println("Lot Area: " + (objLot.lotLength * objLot.lotWidth));

        objLot2.lotLength = objLot1.lotLength * 3;
        objLot2.lotWidth = objLot1.lotWidth + objLot1.lotLength;
        System.out.println("Lot Area of Lot 2: " + (objLot2.lotLength * objLot2.lotWidth));

        System.out.println("\nOwner's Full name of Lot 1: " + objLot1.ownerFirstName + " " + objLot1.ownerLastName);
        System.out.println("Owner's Full name of Lot 2: " + objLot2.ownerFirstName + " " + objLot2.ownerLastName);

        objLot1.address = "Calamba";
        objLot2.address = "Calamba";
        System.out.println("\nLot 1 address: " + objLot1.address);
        System.out.println("Lot 2 address: " + objLot2.address);
    }
}
