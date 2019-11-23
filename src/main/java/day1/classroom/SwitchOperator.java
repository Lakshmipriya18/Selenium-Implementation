package day1.classroom;

public class SwitchOperator {

	/*
	 * Goal: Perform calculation based on the user input operations
	 * 
	 * inputs: 2,3 and "add"
	 * output: added value: 5
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a Switch case: type 'switch', followed by: ctrl + space + down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)I have understood the switch case concepts 
	 * 2)Learned the condition statements to use
	 * 3) 
	 * 
	 */	
	
	public static void main(String[] args) {
		
		// Declare 2 integer numbers
		int i=2;
		int n=3;
				
		// Declare a String variable with input as operations (Tip:
		String operations = "Addition";
		// Initiate switch case for operations
		switch (operations) {
			// Within switch, include as case for add operation
		case "Addition":
			System.out.println("Add Operation "+(i+n));
			break;
			// Within switch, include as case for sub operation
		case "Subtraction":
			System.out.println("Sub Operation "+(i-n));
			break;
			// Within switch, include as case for mul operation
		case "Multiplication":
			System.out.println("Mul Operation "+(i*n));
			break;
			// Within switch, include as case for div operation
		case "Division":
			System.out.println("Div Operation "+(i/n));
			break;
			// Within switch, include 'default' to handle other operations
		default:
			System.out.println("The given operation is not executable");
			break;
		}
		//end of switch case
}

}
