import java.io.IOException;

/* ========================================================================== */
/*	PROGRAM Slot Machine Simulator

    AUTHOR: Megan Camp, Mercedes Kent
    COURSE NUMBER: CIS 210
    COURSE SECTION NUMBER: 02
    INSTRUCTOR NAME: Dr.Tian
    PROJECT NUMBER: 4
    DUE DATE: 09/21/2017

SUMMARY
Create a program that simulates a slot machine. When the program runs, it should do the following:
- Read in the initial amount of money a user wants to enter into the slot.
-Ask the user to enter the amount of money he or she wants to bet. The amount of money
must be a multiple of $10. The minimum is $10 and maximum is the amount of money
the user currently has.
- Display a menu for the user to select a word from the following list:
1. Cherry 2. Orange 3. Apple 4. Peach 5. Melon 6. Pear
-Ask the user to select one word by entering the number between 1 and 6
- Randomly select a word from the above list three times and display all three of the words
-If none of the randomly selected words match, the program will inform the user that he or
she has won $0. If one of the words match, the program will inform the user that he or she has won one time of the amount entered. If two of the words match, the program will inform the user that he or she has won two times the amount entered. If three of the words match, the program will inform the user that he or she has won three times the amount entered.
-The program will ask whether the user wants to play again. If so, these steps are repeated. If not, the program displays the total amount of money entered into the slot machine and the total amount won.

INPUT
This program requires that you read in the following data values:
The amount of money a user owns initially. It is read from a input file named input.txt .Whether or not a user wants to play
The amount of money he wants to bet each time
The word a user selects

OUTPUT
The amount of money the user bets
The word the user selects
The three words the slot machine randomly selects
The amount of money the user wins if any
Whether or not the user wants to continue play
The amount of money the user wins or lose if he or she quits
Greeting messages

ASSUMPTIONS

import java.io.*
/* MAIN FUNCTION */
import java.io.*;
import java.util.Scanner;
public class HW4_SlotMachineSimulation{
   public static void main(String [] args)	throws IOException{ 
	   PrintWriter inputFile=new PrintWriter("Input.txt");
	   System.out.println("Welcome to Guanyu Tian's Slot Machine");
	   Scanner inputFile =new Scanner(inputFile);
	   
	   //Read in the first line from the file to see how much money the user has
	   String line=inputFile.nextLine();
	   //Display the line
	   System.out.printf("You inserted $.2f into the slot machinge!",line);
	   //close the file
	   inputFile.close();
	   
   }
	   
  }