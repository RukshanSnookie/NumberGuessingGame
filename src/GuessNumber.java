import java.util.Scanner;

public class GuessNumber {

	private static Scanner scan = new Scanner(System.in);
	private static int randNumber;
	private static boolean isNum = true;
	
	public static void main(String[] args) {
		System.out.println("Hello  Player!! Welcome to the Number Guessing Game");
		
		randNum();
		guessingtheNum();

	}
	
	public static void guessingtheNum() {
		System.out.println("\nEnter Your Name : ");
		String name = scan.nextLine();
		
		System.out.println("\nHi " +name + " Guess any number between 1-100 : ");
		
		while(isNum) {

			int num = getInput();  // calling user input handling method
			
			if(num==randNumber) {
				System.out.println("Congratulations " + name +"!! You Guessed the number ** " + randNumber + " **");
				playAgain();
			}
			else if(num>randNumber) {
				System.out.println("Ohh, That's too high. Try Again : ");
			}
			else if(num<randNumber) {
				System.out.println("Ohh, That's too low. Try Again : ");
			}
			else {
				System.out.println("Somethinng went wrong :( ");
				return;
			}
		}
		
		
	}
	
	public static  void randNum() {  // generating random number
		int max = 100;
		int min = 1;
		int range = max - min;
		randNumber = (int)(Math.random()* range + min); // generate a random number in the range of 1-100
	}
	
	public static int getInput() { // Handling user inputs
		
		while(true) {
			if(scan.hasNextInt()) {
				int num =  scan.nextInt();
				if(num>=0 && num <=100) {    // validating invalid user inputs
					return num;
				}
				else {
					System.out.println("Please enter a number between 1-100 : ");
				}
			}
			else {
				System.out.println("Invalid Input. Please Try again : ");
				scan.next();  //consume the invalid input
			}
		}	
	}
	
	public static void playAgain() {
		System.out.println("Do you want to play again? (y/n)");
		String response = scan.next().toLowerCase();
		
		
		if(response.equals("n")) {
			System.out.println("Bye");
			isNum = false;
		}
		else if(response.equals("y")) {
			randNum();
			System.out.println("Great!! Enter a new number between 1-100");
		}
		else {
			System.out.println("Something went wrong");
			isNum = false;
		}
	}

}
