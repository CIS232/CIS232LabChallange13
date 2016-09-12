package Lab1;

public class Number {

	public static int getNumber(char letter) {
		int number = 0;
		
		switch (letter) { // A switch statement to give value to the letters.
		case 'A':
		case 'B':
		case 'C':
			number = 2; 
			break;
		// if the character entered is A, B, or C change value of number to 2.	
		case 'D':
		case 'E':
		case 'F':
			number = 3; 
			break;
			// if the character entered is D, E, or F change value of number to 3.	
		case 'G':
		case 'H':
		case 'I':
			number = 4; 
			break;
			// if the character entered is G, H, or I change value of number to 4.
		case 'J':
		case 'K':
		case 'L':
			number = 5; 
			break;
			// if the character entered is J, K, or L change value of number to 5.
		case 'M':
		case 'N':
		case 'O':
			number = 6; 
			break;
			// if the character entered is M, N, or O change value of number to 6.
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
			number = 7; 
			break;
			// if the character entered is P, Q, R, or S change value of number to 7.
		case 'T':
		case 'U':
		case 'V':
			number = 8; 
			break;
			// if the character entered is T, U, or V change value of number to 8.
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			number = 9; 
			break;
			// if the character entered is W, X, Y, or Z change value of number to 9.
		}
		return number;
		//returns the value of number.
	}
	
	
}
