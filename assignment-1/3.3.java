// Create a program that uses a for loop to print the first 10 multiples of a given number.
import java.util.Scanner;
class table{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter a natural number: ");
		int num = obj.nextInt();

		for(int i = 1; i<10+1 ; i++){
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
}