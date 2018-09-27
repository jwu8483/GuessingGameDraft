package JwuGuess;

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
          public static void second(String[] args)
            {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("I Can Guess Your Number That Is Between 0 and 100");
                String result = keyboard.nextLine();
                System.out.println("Is it 50?")
                    if (result == correct)
                    {
                        System.out.println("That Was Too Easy Nerd")
                    }
                    if (result == greater)
                    {

                    }
            }
        }
    }
}
