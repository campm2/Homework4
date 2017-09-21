/* ========================================================================== */
/*	PROGRAM: Slot Machine Simulation
    AUTHOR: Megan Camp, Mercedes Kent
    COURSE NUMBER: CIS 210
    COURSE SECTION NUMBER: 02
    INSTRUCTOR NAME: Dr.Tian
    PROJECT NUMBER: 4
    DUE DATE: 09/21/2017
SUMMARY
A slot machine is a gambling device that the user inserts money into and then pulls a lever or
push a button. The slot machine then displays a set of random images. If one image matches, the
user wins the amount of money he or she bets. If two or more of the images match, the user wins
an amount of money that the slot machine dispenses back to the user.
Create a program that simulates a slot machine. When the program runs, it should do the
following:
1. Read in the initial amount of money a user wants to enter into the slot.
2. Ask the user to enter the amount of money he or she wants to bet. The amount of money
must be a multiple of $10. The minimum is $10 and maximum is the amount of money
the user currently has.
3. Display a menu for the user to select a word from the following list:
	1. Cherry
	2. Orange
	3. Apple
	4. Peach
	5. Melon
	6. Pear
 		i. Ask the user to select one word by entering the number between 1 and 6
 		ii. Randomly select a word from the above list three times and display all three of the words
		iii. If none of the randomly selected words match, the program will inform the user that he or
she has won $0. If one of the words match, the program will inform the user that he or
she has won one time of the amount entered. If two of the words match, the program will
inform the user that he or she has won two times the amount entered. If three of the
words match, the program will inform the user that he or she has won three times the amount entered.
INPUT
This program requires that you read in the following data values:
	1. The amount of money a user owns initially. It is read from a input file named input.txt
	2. Whether or not a user wants to play
 	3. The amount of money he wants to bet each time
 	4. The word a user selects
OUTPUT
-The amount of money a customer will pay
- The amount of money a customer will save if he or she purchase Package B or C
- The amount of money must following a ‘$’ and have 2 decimal points, such as $2.00,
$34.56, etc.
ASSUMPTIONS
The user will enter an integer for the number of hours used 
/* MAIN FUNCTION */

import java.util.Scanner;
import java.io.*;
import java.util.Random;
import java.io.IOException;

public class HW4_SlotMachineSimulation{
   public static void main(String [] args) throws IOException{ 
	   
	   int fruitGuess;
	   int bet;
	   double amountAvailable;
	   char repeatGame='y';
	   String availableMoneyAmount;
	   double bet_Amount;
	   final int MINIMAL_AMOUNT=10;
		int SMALLEST_IMAGE_OPTION=1;
		int BIGGEST_IMAGE_OPTION=6;
	   
	   //create an scanner object to read in values from the user
	   Scanner keyboard = new Scanner(System.in);
	 //open the file
	   
	   File userFile = new File("input.txt");
	   Scanner input = new Scanner(userFile);
	   //PrintWriter outputFile = new PrintWriter("input.txt");
	  
	   //for the random pick 
	   Random fruitGenerator = new Random();
	   
	   // read the first line of the file to determine the amount of money the user has
	   availableMoneyAmount= input.nextLine();
	   amountAvailable= Double.parseDouble(availableMoneyAmount);
	   //close the file
	   input.close();
	   
	   //This is allowing us to write to the output file
	   PrintWriter outFile=new PrintWriter("output.txt");
	 
	   
	  
	   //start of the first while that checks to see if user wants to play
	   while(repeatGame!='n'&&repeatGame!='N') {
		   //welcome into the game
		   System.out.println("Welcome to Megan's and Mercede's Slot Machine");
		   outFile.println("Welcome to Megan's and Mercede's Slot Machine");
		   //this prints the intital amount the user has
		   System.out.printf("You inserted $%.2f into the slot machine!\n", amountAvailable);
		   outFile.printf("You inserted $%.2f into the slot machine!\n", amountAvailable);
		   //this shows how much the user has and how much he/she can bet
		   System.out.printf("You currently have $%.2f, you can bet the multiple of $10.\n",amountAvailable);
		   outFile.printf("You currently have $%.2f, you can bet the multiple of $10.\n",amountAvailable);
		   //how the game works
		   System.out.println("If you enter 1, you will bet $10");
		   outFile.println("If you enter 1, you will bet $10");
		   System.out.println("If you enter 2, you will bet $20,etc.");
		   outFile.println("If you enter 2, you will bet $20,etc.");
		   //ask how much the user wants to bet
		   System.out.println("Please enter how much do you want to bet this time:");
		   outFile.println("Please enter how much do you want to bet this time:");
		   bet_Amount=keyboard.nextDouble();
		   //nested if to check if user input is in the correct range

			   if(bet_Amount<1) {
				   System.out.println("The bet is less than 10.");
				   outFile.println("The bet is less than 10.");
			   }
			   else if(bet_Amount*10 >amountAvailable) {
				   System.out.println("The bet is greater than your current amount of money");
				   outFile.println("The bet is greater than your current amount of money");   
			   }
		   
		   
		  
		   //show the list of options to pick
		   System.out.println("Please type the number corresponding with the word you choose:/n/t 1. Cherry/n/t 2. Orange" + 
		   "/n/t 3. Apple/n/t 4. Peach/n/t 5. Melon/n/t 6. Pear"); 
		   outFile.println("Please type the number corresponding with the word you choose:/n/t 1. Cherry/n/t 2. Orange" + 
				   "/n/t 3. Apple/n/t 4. Peach/n/t 5. Melon/n/t 6. Pear");
		   
		   System.out.println("Please enter your selection");
		   outFile.println("Please enter your selection");
		   fruitGuess=keyboard.nextInt();
		   while() {
			   
		   }
		   
		   
		   //random pick 3
		   //Random(nextInt)
	   }
	   
	   

	   
	   
	   
	   
	   
	   
	  
	
	   //outputFile.close();
	
	   keyboard.close();
	   
	   
   }
}