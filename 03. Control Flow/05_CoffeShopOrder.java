public class CoffeShopOrder {
    public static void main(String[] args) {
        System.out.println("Welcome To Coffee Shop Barista!");
        boolean isLatte = true;
        boolean isIced = false;
        boolean withMatcha = true;

        int itemsOrdered = 1;
        int vanillaPumps = 3;

        if (isLatte == true &&  isIced == true) {
            System.out.println("espresso, milk, ice, syrup.");
        } else if (isLatte == true && withMatcha == true) {
            System.out.println("matcha, oat milk, ice, vanilla.");
        } else if (isLatte == true) {
            System.out.println("espresso, steamed milk.");
        } else {
            System.out.println("Select a drink to get started!");
        }

        if (itemsOrdered > 1) {
            System.out.println("Provide cup holder.");
        }

        if (vanillaPumps >= 2) {
            System.out.println("charge $1 extra.");
        }
    }
}