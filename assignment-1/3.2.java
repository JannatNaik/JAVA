// Implement a program that uses a switch-case statement to determine the day of the week
// based on a numeric input (1 for Monday, 2 for Tuesday, etc.).

import java.util.Scanner;

class week{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a number between 1 to 7 to represent the day:");
		int ch = obj.nextInt();

		switch(ch){
			case 1:
				System.out.println("the day is Monday");
				break;
			case 2:
				System.out.println("the day is Tuesday");
				break;
			case 3:
				System.out.println("the day is Wednesday");
				break;
			case 4:
				System.out.println("the day is Thursday");
				break;
			case 5:
				System.out.println("the day is Friday");
				break;
			case 6:
				System.out.println("the day is Saturday");
				break;
			case 7:
				System.out.println("the day is Sunday");
				break;
			default:
				System.out.println("Enter a valid input!!");
				break;
		}

	}
}