package prashant;
import java.util.Scanner;
public class Game2 {



  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	   int Total_Round = 3;  
	     int Max_Attempt = 5;  
	      int Total_Score = 0;  

        System.out.println("Welcome to the 'Guess the Number' game!");

	       
	   for (int round = 1; round <= Total_Round; round++) {
	        System.out.println("\n--- Round " + round + " ---");

	       int Random_NO = 1 + (int) (100 * Math.random());
	       int attempts = 0;
	         boolean isCorrect = false;

	            System.out.println(" picked a number between 1 and 100. Can you guess it?");
	    while (attempts < Max_Attempt) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == Random_NO) {
	                    System.out.println(" You guessed the correct number.");
	                int roundScore = (Max_Attempt - attempts + 1) * 10; 
	                    Total_Score += roundScore;
	                   System.out.println("you earned " + roundScore + " points ");
	                    isCorrect = true;
	                    break;
	                } else if (userGuess < Random_NO) {
	                    System.out.println("entered number is lower then guess");
	                } else {
	                    System.out.println("entered no is higher then guess");
	                }
	            }

	            if (!isCorrect) {
	                System.out.println(" you used all attempts the correct number generated  is: " + Random_NO);
	            }
	        }

	       
	        System.out.println("\nGame Over, score is: " + Total_Score);
	        System.out.println("Thanks for playing wonderfull game");
	        scanner.close();
	    }
	}

