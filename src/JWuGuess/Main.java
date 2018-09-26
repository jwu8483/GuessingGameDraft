package JWuGuess;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int secretNumber = (int) (100 * Math.random());
        int Guess = 0;


        Scanner keyboard = new Scanner(System.in);
        do {

            System.out.println("What is the Number?");
            int num = keyboard.nextInt();
            if (num == secretNumber) {
                System.out.println("You are correct");
                Guess = Guess + 1;
                System.out.println("It took you " + Guess + " 1" + "Guesses");
            } else if (num > secretNumber) {
                System.out.println("You are too high");
                Guess = Guess + 1;
            } else {
                System.out.println("You are too low");
                Guess = Guess + 1;
            }
        }while (Guess != secretNumber);
    }
}
