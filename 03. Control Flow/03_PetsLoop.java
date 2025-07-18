public class PetsLoop {
    public static void main(String[] args) {
        boolean isDogOwner = true;
        boolean isCatOwner = true;

        if (isDogOwner == true && isCatOwner == true) {
            System.out.println("PETS 20% off all items");
        } else if (isDogOwner == true) {
            System.out.println("WOOF 20% off dogs items.");
        } else if (isCatOwner == true) {
            System.out.println("MEOW 20% off cats items.");
        } else {
            System.out.println("Welcome to the Pets store!");
        }
    }
}
