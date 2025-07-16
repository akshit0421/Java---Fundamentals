import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args) {
        System.out.println("I speak without a mouth and hear without ears. I have no body, but I come alive with the wind. What am I?");

        //Object to setup the read input from users!
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Answer: ");
        String answer = sc.nextLine();

        System.out.println(answer);
    }
}
