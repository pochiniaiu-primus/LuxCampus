package homework;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int randomValue;
        Random random = new Random();
        randomValue = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Enter a guess (1-100): ");
            guess = scanner.nextInt();
            if (guess == randomValue)
                System.out.println("Your guess is correct. Congratulations!");
            else if (guess < randomValue)
                System.out.println("Your guess is smaller than the secret number.");
            else if (guess > randomValue)
                System.out.println("Your guess is greater than the secret number.");
        } while (guess != randomValue);
    }
}

