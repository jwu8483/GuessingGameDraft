package JwuGuess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int secretNumber = (int) (100 * Math.random());
        int Guess = 0;

        Scanner keyboard = new Scanner(System.in);
        int num = -1;
        do {

            System.out.println("What is the Number?");
            num = keyboard.nextInt();
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
        } while (num != secretNumber);
        sub();
    }
    public static void sub()
    {
        int Guess = 50;
        int max = 100;
        int min = 1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I Can Guess Your Number That Is Between 0 and 100");
        System.out.println("Is it"  + " " + Guess + ", reply with (greater) (less) or (correct)");
        String result = keyboard.nextLine();
        do{
            if (result.equals("correct"))
            {
                System.out.println("That Was Too Easy Nerd");
                result = keyboard.nextLine();
            }
            else if (result.equals("greater"))
            {
                min = Guess;
                Guess = (max + min)/2;
                System.out.println("Is it"  + " " + Guess + ", reply with (greater) (less) or (correct)");
                result = keyboard.nextLine();
            }
            else if (result.equals("less"))
            {
                max = Guess;
                Guess = (max + min)/2;
                System.out.println("Is it"  + " " + Guess + ", reply with (greater) (less) or (correct)");
                result = keyboard.nextLine();
            }
        }while (!result.equals("correct"));
    }

}
