/**
 * @author kimyang
 * 
 * Craps Project
 * Period 6
 */
import java.util.Scanner;

public class Craps 
	{
	
		public static void main(String[] args)
		{
			/**
			 * Creating Scanner object so user can input stuff
			 * creating two dice objects 
			 * Initializing boolean variables which will be used for while loops later on
			 * Assigning true to play so the first while loop will run
			 * Initializing rolls to store the value of each dice roll
			 * Initializing sum and initialSum, will later store the sum of roll3 and roll4, and roll1 and roll2 inside each respectively
			 */
			Scanner in = new Scanner(System.in);
			DicePractice dice1 = new DicePractice();
			DicePractice dice2 = new DicePractice();
			System.out.println("Welcome to the Craps game.");
			
			boolean play = true;
			boolean rollAgain;
			boolean prompt;
			int roll1;
			int roll2;
			int roll3;
			int roll4;
			int initialSum;
			int sum;
			/**
			 * While loop starts the game and will run until play = false
			 */
			while (play)
			{
				/**
				 * In.nextLine continues the program once the user presses enter
				 * Integer dice1.roll() and dice2.roll() stored into roll1 and roll2 respectively
				 * Sum of roll1 and roll2 stored into initialSum
				 */
				System.out.println("Press enter to roll.");
				in.nextLine();
				
				roll1 = dice1.roll();
				roll2 = dice2.roll();
				initialSum = roll1 + roll2;
				
				/**
				 * The if statement is saying that if initialSum equals 7 or 11, then the block of code will run and print
				 * the value of roll1, roll2, their sum, and the game ends because the user wins
				 */
			
			if (initialSum == 7 || initialSum == 11)
				{
					System.out.println("The First Dice rolled: " + roll1);
					System.out.println("The Second Dice rolled: " + roll2);
					System.out.println("The sum is: "+ initialSum);
					System.out.println("You have won!");
					
				}
			/**
			 * The else if statement is saying that if initialSum equals 2 or 12, then the block of code will run and print
			 * the value of roll1, roll2, their sum, and the game ends because the user loses
			 */
			else if (initialSum == 2 || initialSum == 12)
				{
					System.out.println("The First Dice rolled: " + roll1);
					System.out.println("The Second Dice rolled: " + roll2);
					System.out.println("The sum is: "+ initialSum);
					System.out.println("You have lost. :(");
				}	
			/**
			 * The else statement is saying that for any value for the initialSum that is not 2, 7, 11, or 12,
			 * then the block of code will run and print
			 * the value of roll1, roll2, their sum, and the game ends continues because the user gets a "point"
			 */
			else 
				{
				System.out.println("The First Dice rolled: " + roll1);
				System.out.println("The Second Dice rolled: " + roll2);
				System.out.println("You got the point: " + initialSum+ ". So let's roll the die again.");
				
				/**
				 * For the game to continue (and for the die to keep rolling), we use a while loop and assign true to rollAgain so 
				 * that the loop will run.
				 * This while loop rolls the die again and stores their values into roll3 and roll4, and their sum into the variable sum
				 */
				rollAgain = true;
				while (rollAgain)
					{
					roll3 = dice1.roll();
					roll4 = dice2.roll();
					sum = roll3 + roll4;
					
					/**
					 * The if statement runs so that if the sum equals 7, then the block of code prints
					 * the new value of the rolls, the sum of these rolls, and that the user losers. 
					 * True is assigned to rollAgain because the user already lost, so there is no need to roll the die again
					 */
					
					if (sum == 7)
					{
						System.out.println("The First Dice rolled: " + roll3);
						System.out.println("The Second Dice rolled: " + roll4);
						System.out.println("The sum is: "+ sum);
						System.out.println("You have lost:(");
						rollAgain = false;
					}
					/**
					 * The else if statement runs so that if the sum equals the initialSum, then the block of code prints
					 * the new value of the rolls, the sum of these rolls, and that the user wins.
					 * True is assigned to rollAgain because the user already won so there is no need to roll the die again
					 */
					else if (sum == initialSum)
					{
						System.out.println("The First Dice rolled: " + roll3);
						System.out.println("The Second Dice rolled: " + roll4);
						System.out.println("The sum is: "+ sum);
						System.out.println("You have won!");
						rollAgain = false;
					}
					
					/**
					 * The else statement runs so that if the sum does not equal the initialSum or 7, then the block of code prints
					 * the new value of the rolls, the sum of these rolls, and that the sum is not the initialSum. 
					 * True is assigned to rollAgain because the die must keep rolling until the user either wins or loses.
					 */
					else 
					{
						System.out.println("The First Dice rolled: " + roll3);
						System.out.println("The Second Dice rolled: " + roll4);
						System.out.println("The sum is: "+ sum + ", which is not " + initialSum);
						System.out.println("We shall roll again.");
						rollAgain = true;
					}
					
					}
					
				}
			/**
			 * True is assigned to the variable prompt so that this while loop will run.
			 * This while loop is being used to prompt the user and ask if they would like to play the game again
			 */
			prompt = true;
			while (prompt)
				{
				/**
				 * Storing the string "y" or "n" into the String variable answer.
				 * If it is not "y" or "n", the program will reprompt the user.
				 */
				System.out.println("Would you like to play again? If yes, type y. If no, type n.");
				String answer = in.next();
				in.nextLine();
				
				/**
				 * If the inputed string is "y", then this while loop terminates but the program, starting from the first while
				 * loops, runs the block of code (that is the game) again
				 */
				if (answer.equals("y"))
					{
					prompt= false;
					play = true; 
					}
				/**
				 * If the inputed string is "n", then this while loop terminates but the overall program also does not run because
				 * the variable for running the while loop that will run the game is false.
				 */
				else if (answer.equals("n"))
					{
					prompt = false;
					play = false;
					}
				/**
				 * If the inputed string is anything but "y" or "n", the program reprompts the user because true is still 
				 * assigned to the boolean variable prompt. So this while loop runs again, going through each block of code
				 */
				else
					{
					System.out.println("Sorry that's not a valid answer.");
					prompt = true; 
					}
				}
			}
		}
	}