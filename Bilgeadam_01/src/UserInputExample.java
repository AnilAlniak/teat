import java.util.Scanner;

public class UserInputExample {

	public static void main(String[] args) {

		System.out.println("Write a number to add 10 of this number: " );
		Scanner result = new Scanner(System.in);
		int userInput = result.nextInt();
		
		System.out.println("Result after adding 10 : " + (userInput + 10));
		
	}

}
