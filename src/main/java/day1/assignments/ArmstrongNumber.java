package day1.assignments;

public class ArmstrongNumber {
	
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)I have learned the concepts of looping and conditional statements
	 * 2)While loop concepts are clear now
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Declare your input
		int input = 154;
		
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		int rem, org;
		int cal = 0;
		
		// Assign input into variable original 
		org = input;
		
		// Use loop to calculate: which loop to use until the number greater than 0??
		while (input > 0) {
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			rem = input%10;
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			int quo = input/10;
			input = quo;
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			cal = cal + (rem*rem*rem);
		}
		// Check whether calculated and original are same
		if (org == cal) 
			//When it matches print it as Armstrong number
			System.out.println("The given number is an Armstrong number: "+cal);
		else 
			System.out.println("The given number is not an Armstrong number");
	
	}

}
