//Write a program that calculates the area and perimeter of a rectangle, given the length and
//width as input.

class rectangle{
	public static void main(String args[]){
		double length = Double.parseDouble(args[0]);
		double width = Double.parseDouble(args[1]);

		double area = ar(length, width);
		double parameter = para(length, width);
			
		System.out.println("area of rectangle: "+ area);
		System.out.println("parameter of rectangle: "+ parameter);	
		
	}
	public static double ar(double length, double width){
		double area = length * width;
		return area;
	}
		
	public static double para(double length, double width){
		double parameter = (length+width)*2;
		return parameter;
	}
}