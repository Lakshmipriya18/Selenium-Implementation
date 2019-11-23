package day1.classroom;

public class SumOfDigits {

	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123
	 * output: 1+2+3 = 6
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'while' loop: type 'while', followed by ctrl + space + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */

	public static void main(String[] args) {

		// Declare your input number (int)
		int num = 123;

		// Initialize an integer variable by name: sum
		int sum = 1;

		// Use loop to calculate the sum: which loop to use until the number goes less than 10??
		while (num > 10) {
			// Within loop: get the remainder when done by 10 -> Tip: use mod
			int remainder = num%10;
			// Print the remainder to confirm
			System.out.println("Remainder: "+remainder);
			// Within loop: add that remainder to the sum
			sum = sum + remainder;
			// Print the sum to confirm
			System.out.println("Sum: "+sum);
			// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			num = num/10;
			// Print the quotient to confirm
			System.out.println("Number: "+num);
			}
		// Outside the loop: print the final sum
		System.out.println("Sum of digits: "+sum);
		}
	}


