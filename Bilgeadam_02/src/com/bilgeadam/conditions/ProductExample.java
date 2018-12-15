package com.bilgeadam.conditions;
import java.util.Scanner;

public class ProductExample {

	public static void main(String[] args) {

		/*
		 * This program will calculate the product of three integers.
		 */

//	b) Create a Scanner called input that reads values from the standard input.

		Scanner input = new Scanner(System.in);

//	c) Declare the variables x, y, z and result to be of type int.

		int x;
		int y;
		int z;

//	d) Prompt the user to enter the first integer.

		System.out.println("Please" + " enter the first number :");

//	e) Read the first integer from the user and store it in the variable x.

		x = input.nextInt();

//	f) Prompt the user to enter the second integer.

		System.out.println("Please enter the second number :");

//	g) Read the second integer from the user and store it in the variable y.

		y = input.nextInt();

//	h) Prompt the user to enter the third integer.

		System.out.println("Please enter the third number :");

//	i) Read the third integer from the user and store it in the variable z.

		z = input.nextInt();

//	j) Compute the product of the three integers contained in variables x, y and z, and assign the result to the variable result.

		int result = x + y + z;

//	k) Display the message "Product is" followed by the value of the variable result.        

		System.out.println("Product is : " + result);

	}

}
