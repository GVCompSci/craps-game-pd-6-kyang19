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
			while (play)
			{
				System.out.println("Press enter to roll.");
				in.nextLine();
				
				roll1 = dice1.roll();
				roll2 = dice2.roll();
				initialSum = roll1 + roll2;
			
			if (initialSum == 7 || initialSum == 11)
				{
					System.out.println("The First Dice rolled: " + roll1);
					System.out.println("The Second Dice rolled: " + roll2);
					System.out.println("The sum is: "+ initialSum);
					System.out.println("You have won!");
					
				}
			
			else if (initialSum == 2 || initialSum == 12)
				{
					System.out.println("The First Dice rolled: " + roll1);
					System.out.println("The Second Dice rolled: " + roll2);
					System.out.println("The sum is: "+ initialSum);
					System.out.println("You have lost. :(");
				}	
			else 
				{
				System.out.println("The First Dice rolled: " + roll1);
				System.out.println("The Second Dice rolled: " + roll2);
				System.out.println("You got the point: " + initialSum+ ". So let's roll the die again.");
				
				
				rollAgain = true;
				while (rollAgain)
					{
					roll3 = dice1.roll();
					roll4 = dice2.roll();
					sum = roll3 + roll4;
					
					if (sum == 7)
					{
						System.out.println("The First Dice rolled: " + roll3);
						System.out.println("The Second Dice rolled: " + roll4);
						System.out.println("The sum is: "+ sum);
						System.out.println("You have lost:(");
						rollAgain = false;
					}
					else if (sum == initialSum)
					{
						System.out.println("The First Dice rolled: " + roll3);
						System.out.println("The Second Dice rolled: " + roll4);
						System.out.println("The sum is: "+ sum);
						System.out.println("You have won!");
						rollAgain = false;
					}
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
			prompt = true;
			while (prompt)
				{
				System.out.println("Would you like to play again? If yes, type y. If no, type n.");
				String answer = in.next();
				in.nextLine();
			
				if (answer.equals("y"))
					{
					prompt= false;
					play = true; 
					}
			
				else if (answer.equals("n"))
					{
					prompt = false;
					play = false;
					}
				else
					{
					System.out.println("Sorry that's not a valid answer.");
					prompt = true; 
					}
				}
			}
		}
	}