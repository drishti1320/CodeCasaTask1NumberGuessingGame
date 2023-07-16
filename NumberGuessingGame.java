package Task1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        

        // create a scanner object to read user input
        Scanner sc = new Scanner(System.in);
        String play = "yes";
        
        //while loop to determine if we are going to play the game again
        while(play.equals("yes"))
        {
        
            // generating the random class
            Random rnd = new Random();

            // generate a random number between 1 and 100
            int randomNum = rnd.nextInt(100) + 1;

            int numberOfTries = 0;
            boolean win = false;
        
            System.out.println("You have 10 tries to guess a number between(1-100) :");

            // while loop to check the game is over 
            while(!win && numberOfTries < 10)
            {
                System.out.print("Guess a number :");
           
                    // Taking input from the player(Player guesses the number)
                    int playerGuess = sc.nextInt();
                    numberOfTries++;
           
                    if(playerGuess < 1 || playerGuess > 100)
                    {
                        System.out.println("Guess is out of range");
                          continue;

                    }

                    if(playerGuess == randomNum)
                    {
                       win = true;
                       System.out.println("You win!");
            
                       System.out.println("The number was : " + randomNum);
                       System.out.println("It took you " + numberOfTries + " tries.");
                       System.out.println("Would you like to play again? yes or no :");
                       play = sc.next().toLowerCase();

                    }
                    else if(randomNum > playerGuess) 
                    {
                        System.out.println("Nope! The number is higher. Guess again.");
                 
                    }
                    else
                    {
                       System.out.println("Nope! The number is lower. Guess again.");
                 
                    }
            
            } 
        }
        

    }

}
