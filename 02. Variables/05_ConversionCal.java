import java.util.Scanner;

/* Conversion Calculator Program Using User Input!*/
public class ClubPenguin {
    public static void main(String[] args) {
        // Write your code here 💖
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To My Calculator!");

        double coin = 0.0045;

        System.out.println("Enter the number of coins: ");
        double userInput = sc.nextDouble();
        double result = userInput * coin;

        System.out.println("The amount in USD is ");
        System.out.println(result);
    }
}
