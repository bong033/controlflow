package moviediscounts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        age = scanner.nextInt();

        if (age < 5) {
            System.out.println("Enjoy 60% discount for your movie ticket at 4.2 Euros.");
        } else if (age > 60) {
            System.out.println("Enjoy 55% discount for your movie ticket at 3.15 Euros.");
        } else {
            System.out.println("Your movie ticket is 7 Euros.");
        }
    }
}

