public class ThemeParkDecision {
    public static void main(String[] args) {
        int height = 120; //Centimeters
        int weight = 45; //Kilograms

        if (height >= 120 && weight >= 40) {
            System.out.println("Congrats! You can ride! \uD83C\uDFA2");
        } else {
            System.out.println("Sorry. You can't ride today. \uD83D\uDE1E");
        }
    }
}
