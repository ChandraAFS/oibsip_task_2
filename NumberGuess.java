import java.util.Random;
import java.util.Scanner;

public class NumberGuess 
{
    public static void main(String[] args) {
        
        int numberOfGuess=0;
        int userInput= 0;

        Scanner sc=new Scanner(System.in);
        

        Random rand=new Random();
        int compInput=rand.nextInt(100);
        

       do{
         System.out.println("Enter user choice ");
        userInput= sc.nextInt();
         numberOfGuess++;
          
            
        if(userInput==compInput)
        {
            System.out.println("Congratulations! You guessed the correct number");
        }
        else if(userInput<compInput)
        {
            System.out.println("Your guess is low, try again.");
        }
        else if(userInput>compInput)
        {
            System.out.println("Your guess is high, try again.");
        }

    }while(userInput!=compInput);
    System.out.println("Number of guesses: "+numberOfGuess);
}
}
