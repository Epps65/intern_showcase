import java.util.Scanner;
public class Showcase_Exact_Change {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter an amount in dollars (Example 19.99): ");
        double amount = scanner.nextDouble();

        // Make the cents a whole number
        int remainingCents = (int) Math.round(amount * 100);

        // Calculate the number of each using modulus
        int hundreds = remainingCents / 10000;
        remainingCents %= 10000;

        int fifties = remainingCents / 5000;
        remainingCents %= 5000;

        int twenties = remainingCents / 2000;
        remainingCents %= 2000;

        int tens = remainingCents / 1000;
        remainingCents %= 1000;

        int fives = remainingCents / 500;
        remainingCents %= 500;

        int ones = remainingCents / 100;
        remainingCents %= 100;

        int quarters = remainingCents / 25;
        remainingCents %= 25;

        int dimes = remainingCents / 10;
        remainingCents %= 10;

        int nickels = remainingCents / 5;
        remainingCents %= 5;

        int pennies = remainingCents;

        // Display the result
        System.out.println("Least amount of change given: ");
        if (hundreds > 0) System.out.println(hundreds + " - $100 bill");
        if (fifties > 0) System.out.println(fifties + " - $50 bill");
        if (twenties > 0) System.out.println(twenties + " - $20 bill");
        if (tens > 0) System.out.println(tens + " - $10 bill");
        if (fives > 0) System.out.println(fives + " - $5 bill");
        if (ones > 0) System.out.println(ones + " - $1 bill");
        if (quarters > 0) System.out.println(quarters + " - quarter");
        if (dimes > 0) System.out.println(dimes + " - dime");
        if (nickels > 0) System.out.println(nickels + " - nickel");
        if (pennies > 0) System.out.println(pennies + " - penny");

    }
}
