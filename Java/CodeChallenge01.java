import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;
        
        System.out.println("Welcome to the guessing game!");
        System.out.println("Try to guess the number between 1 and 100.");
        
        while (guess != secretNumber) {
            System.out.print("What's your guess?");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }
        scanner.close();
    }
}
