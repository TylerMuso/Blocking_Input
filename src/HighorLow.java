import java.util.Scanner;

public class HighorLow {
    static void main()
    {
        Scanner in = new Scanner(System.in);

        int randomNum = (int)(Math.random() * 10) + 1;
        int guess = 0;
        boolean done = false;
        String trash = "";

        do{
            IO.print("Guess a number from 1 to 10: ");

            if(in.hasNextInt())
            {
                guess = in.nextInt();

                if(guess >= 1 && guess <= 10)
                {
                    done = true;
                }
                else
                {
                    IO.println("Your guess must be between 1 and 10, not: " + trash + "\nTry again!");

                }
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid integer, not: " + trash + "\nTry again!");
            }
        }while(!done);

        IO.println("The random number was " + randomNum);

        if(guess > randomNum)
        {
            IO.println("Your guess was too high!");
        }
        else if(guess < randomNum)
        {
            IO.println("Your guess was too low!");
        }
        else
        {
            IO.println("Your guess was right!");
        }
    }
}
