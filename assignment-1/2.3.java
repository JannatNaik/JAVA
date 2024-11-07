//Create a Circle class with the following properties: radius. Implement methods to calculate
//the area= pi*r^2 and circumference= 2*pi*r of the circle.
import java.util.Scanner;
class circle{
	public double radius;
	public static double pi = 3.14;


	public circle(double rad){
		radius = rad;
	}

	public double circumference(double radius){
		double circumference = 2*this.pi*radius;
		return circumference;
	}

	public double area(double radius){
		double area = this.pi * radius * radius;
		return area;
	}

	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		double radius = obj.nextDouble();

		circle c1 = new circle(radius);

		System.out.println("Enter the operation you want to perform: ");
		System.out.println("Enter 1 to find circumference of a circle ");
		System.out.println("Enter 2 to find area of a circle");
		int ch = obj.nextInt();

		switch(ch){
			case 1:
				double circum = c1.circumference(radius);
				System.out.println("circumference of the given circle is: "+ circum);
				break;
			case 2:
				double area = c1.area(radius);
				System.out.println("Area of the given circle is: "+ area);
				break;
			default:
				System.out.println("Enetr a valid option!!");
				break;
		}
	}
}