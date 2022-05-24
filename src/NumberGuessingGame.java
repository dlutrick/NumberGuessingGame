import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean win = false;
        System.out.println("Please guess a number between 1 and 100.");
        for(int i = 9; i > 0; i--) {
            int guess = scanner.nextInt();
            if(guess > randomNumber) {
                System.out.println("Your guess is too high.");
                System.out.println("You have " + i + " guess(es) left.");
            } else if(guess < randomNumber) {
                System.out.println("Your guess is too low.");
                System.out.println("You have " + i + " guess(es) left.");
            } else if(guess == randomNumber) {
                System.out.println("You guessed right!");
                System.out.println("You have " + i + " guess(es) left.");
                win = true;
                break;
            }
        }
        if(win == true) {
            System.out.println("You win!");
        }
    }
}
