// Write a program that takes a number as input and determines whether it is even or odd
// using an if-else statement.
import java.util.Scanner;

class o_e_num{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a natural number: ");
		int num = obj.nextInt();

		if(num != 0){
			if(num%2 == 0){
				System.out.println("the number is even");
			}else{
				System.out.println("the number is odd");
			}
		}
	}
}