
import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("\n===NUMBER GUESSING GAME====");
        System.out.println("\n\nRULES:\n* You have to guess the number between according to your difficulty \n* At every guess you get a hint that your guess is either TOO HIGH or TOO LOW ");
        
        System.out.println("\n\n===Enter the difficulty===\n1=EASY->1-40\n2=MEDIUM->1-70\n3=HARD->1-120");
        int difficulty=sc.nextInt();

        int maxNumber;

        switch(difficulty) {

        case 1:
            maxNumber = 40;
            System.out.println("Difficulty -> EASY");
        break;

        case 2:
            maxNumber = 70;
            System.out.println("Difficulty -> MEDIUM");
        break;

        case 3:
            maxNumber = 120;
            System.out.println("Difficulty -> HARD");
        break;

        default:
            maxNumber = 40;
            System.out.println("Invalid choice. Default difficulty -> EASY");
        break;
        }

        Random r = new Random();
        int number=r.nextInt(maxNumber)+1;
            
        int attempts=0;
        int guess=0;
        while(guess!=number){
            System.out.println("\nEnter your guess : ");
            guess=sc.nextInt();
         attempts++;
        
            if(guess<number){
                System.out.println("TOO LOW !");
             }
            else if(guess==number){
                System.out.println("CORRECT");
                System.out.println("\nYou have guessed the number in " +attempts+ " attempts");
            }
            else{
                System.out.println("TOO HIGH !");

            }
        }    

    }

}
    
