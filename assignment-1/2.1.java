//Create a Person class with the following properties: name, age, and gender. Implement
//methods to set and get these properties.

import java.util.Scanner;
class person{
	String name;
	String age;
	String gender;

	public person(String n, String a, String g){
		name = n;
		age = a;
		gender = g;
	}

	public void setdetails(String name, String age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getname(){
		return name;
	}

	public String getage(){
		return age;
	}

	public String getgender(){
		return gender;
	}

	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = obj.nextLine();

		System.out.println("Enter your age: ");
		String age = obj.nextLine();

		System.out.println("Enter your gender: ");
		String gender = obj.nextLine();

		person p1 = new person(name, age, gender);

		System.out.println();
		System.out.println("Name: "+ p1.getname());
		System.out.println("Age: "+ p1.getage());
		System.out.println("Gender: "+ p1.getgender());
	}
}