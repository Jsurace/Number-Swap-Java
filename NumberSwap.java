/*
Filename:	NumberSwap.java
Author:	Jenna
Date:	2/18/19

Number swapping algorithm user inputs numbers, then the program will
echo the values and lastly output the original values once swap has 
taken place(firstNum becomes secondNum, and secondNum will become firstNum).
*/

import java.util.Scanner;

public class NumberSwap
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please Enter Your First Number: ");
		int firstNum = keyboard.nextInt();

		System.out.println("Please Enter Your Second Number: ");
		int secondNum = keyboard.nextInt();

		keyboard.close();

		System.out.println("You Entered " + firstNum + "  " + secondNum);

		firstNum = firstNum + secondNum;
		secondNum = firstNum - secondNum;
		firstNum = firstNum - secondNum;

		System.out.println("The Numbers After The Swap Are Now: " + firstNum + "  " + secondNum);
	}
}

