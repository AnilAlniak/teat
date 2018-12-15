package com.bilgeadam.conditions;
import java.util.Locale;
import java.util.Scanner;

public class BmiExample {

	public static void main(String[] args) {

		/*
		 * this program will calculate user body mass index (bmi).
		 */

//	b) Create a Scanner called input that reads values from the standard input.

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.ENGLISH);

//	c) Declare the variable height & weight and result to be of type double.

		double height;
		double weight;

//	d) Prompt the user to enter the weight at first.

		System.out.println("Please enter your weight : ");

//	e) Read the weight  as double from the user and store it in the variable weight.

		weight = input.nextDouble();

//	f) Prompt the user to enter the height at second.

		System.out.println("Please enter your height : ");

//	g) Read the height  as double from the user and store it in the variable height.

		height = input.nextDouble();

//	h) Compute the bmi of user and assign the result to the variable bmi_result.

		double result = weight / (height * height);

//	I) Display the message "You are –xxxxx---" followed by the value of the variable result. 

		if (result < 18.5) {
			System.out.println("You are underweight...");
		} else if (result >= 18.5 && result < 24.9) {
			System.out.println("You are normal...");
		} else if (result >= 25 && result < 29.9) {
			System.out.println("You are overweight...");
		} else if (result > 30) {
			System.out.println("You are very overweight...");
		}

	}

}
