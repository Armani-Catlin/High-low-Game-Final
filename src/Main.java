import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int guess, answer, count=0;
        String restart;

        System.out.println(" Welcome to the High-Low Guessing Game.");
        System.out.println("You'll guess a number, but we will only tell you whether you are too high or too low.");
        Random generator = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Pick a number between 1-100(enter 0 to quit)? ");
        guess = input.nextInt();

        answer = generator.nextInt(100) + 1; // this is what gets a random number between 1-100 each time
        System.out.println("This is the answer" + answer);
        do {


            if (guess < answer) {
                System.out.println("Your guess is too low, try again");
                guess = input.nextInt();
            }
            if (guess > answer) {
                System.out.println("Your guess is too high, try again");
                guess = input.nextInt();
            }
        }
        while (guess != 0 && count++ < 8);

        if (guess == 0) { // if the user types 0, the game will quit.
            System.out.println("\nDo you want to play again Y/N?");
            restart = input.next();
            if (restart.equalsIgnoreCase("Y")) {
                System.out.print("Enter a number between 1 and 100 to start playing");
                guess = input.nextInt();
            }
        }
        if (guess == answer) {
            System.out.println("Darn you beat me. Ill get you next time");
        }
        else {
            System.out.println("I am superior you cant beat me !!");
        }

        System.out.print("Thanks for playing!");
    }
}
