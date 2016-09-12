package Lab1;

import java.util.Scanner;

public class lab1B {

	public static void main(String[] args) {
		char choice; 
		String input; // holds Y or N value for input
		String phoneNumber; // declares a string named phoneNumber.

		System.out.print("Enter an alphanumeric phone number. ");
		// ask user for number.
		do {
			Scanner keyboard = new Scanner(System.in);
			//creates scanner object.
			phoneNumber = keyboard.nextLine();
			// prompts the user for a phone number then sets the Sting
			// phoneNumber to the entered number.

			for (int i = 0; i < phoneNumber.length(); i++) {
				
				if (Character.isLetter(phoneNumber.charAt(i)))
				//checks each character in phoneNumber with i
					System.out.print(Number.getNumber(Character.toUpperCase(phoneNumber.charAt(i))));
				// changes any lower case letters to upper case and prints out
				// the corresponding numerical value.
				else
					System.out.print(phoneNumber.charAt(i));
				// if the character entered is a number it returns that number.
			}
			System.out.println();
			System.out.println("Enter another number? (Y or N)");

			input = keyboard.nextLine(); // stores input of user.
			choice = input.charAt(0);// sotres the value chosen by user.

		} while (Character.toUpperCase(choice) == 'Y');
		// changes lower case to upercase and repets program is Y is enterd.
	}

}
