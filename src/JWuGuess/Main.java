package JwuGuess;

import java.util.Scanner;

public class Main {
    /*
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
    }
}*/
           public static void main(String[] args)
            {
                int Guess = 50;
                String one = "correct";
                Scanner keyboard = new Scanner(System.in);
                System.out.println("I Can Guess Your Number That Is Between 0 and 100");
                System.out.println("Is it" + " " + Guess);
                String result = keyboard.nextLine();
                    if (result == one)
                    {
                        System.out.println("That Was Too Easy Nerd");
                    }
                    else if (result == "greater")
                    {
                        Guess = Guess + (Guess/2);
                        System.out.println("Is it"  + " " + Guess);
                    }
                    else
                    {
                        Guess = Guess - (Guess/2);
                        System.out.println("Is it" + " "  + Guess);
                    }
            }
        }
