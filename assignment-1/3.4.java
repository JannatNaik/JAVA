// Write a program that uses a while loop to calculate the factorial of a given number.
import java.util.Scanner;
class factorial{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);

		System.out.println("Eneter a number: ");
		int num = obj.nextInt();

		if(num<0){
			System.out.println("factorial is not defined for negative number");
		}else{
			long fact = 1;
			int i = 1;

			while(i <= num){
				fact = fact * i;
				i++;
			}

			System.out.println("factorial of "+num+" is "+fact);
		}
	}
}