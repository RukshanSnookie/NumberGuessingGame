import java.util.Scanner;

public class GuessNumber {

	private static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("Hello  Player!! Welcome to the Number Guessing Game");
		
		logIn();

	}
	
	public static void logIn() {
		System.out.println("\nEnter Your Name : ");
		String name = scan.nextLine();
		System.out.println("\nHi " +name + " Guess any number between 1-100 : ");
		int num = scan.nextInt();
	}

}
