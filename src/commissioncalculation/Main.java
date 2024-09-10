package commissioncalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float userInput;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your sales value: ");
        userInput = scanner.nextInt();

        if (userInput <= 1000) {
            System.out.println("You have no commission, WAKE UP!");
        } else if (userInput > 1000 && userInput <= 5000) {
            System.out.println("Your commission is $" + String.format("%.2f", userInput * 0.1));
        } else if (userInput > 5000 && userInput < 10000) {
            System.out.println("Your commission is $" + String.format("%.2f", userInput * 0.2));
        } else {
            System.out.println("Your commission is $" + String.format("%.2f", userInput * 0.3));
        }
    }
}
