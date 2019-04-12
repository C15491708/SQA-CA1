
import java.util.Scanner;

public class Statements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*
		 * Asking a user to input a number and creating a simple if-else
		 * statement displaying different messages based on the number they entered.
		 */
		System.out.print("Enter a number between 1 and 5: ");
		int answer = scan.nextInt();
		
		if (answer == 1) {
			System.out.println("You entered 1");
		} else if (answer == 2) {
			System.out.println("You entered 2");
		} else if (answer == 3) {
			System.out.println("You entered 3");
		} else if (answer == 3) {
			System.out.println("You entered 4");
		} else if (answer == 3) {
			System.out.println("You entered 5");
		} else {
			System.out.println("The number you entered wasn't between 1 and 5!!");
		}
		
		
		/*
		 * Simple For loop that executes 10 times and displays
		 * the current index of the loop each time.
		 */
		System.out.println("\nFor loop example: \n");
		for (int i = 0; i < 10; i ++) {
			System.out.println("Loop Index: " + i);
		}
	}
}