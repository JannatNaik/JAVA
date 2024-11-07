// Create a Student class with the following properties: name, grade, and age. Implement the following
// methods:
// setName(String name): Sets the student's name.
// getGrade(): Returns the student's grade.
// incrementAge(): Increments the student's age by 1.
// printStudentInfo(): Prints the student's name, grade, and age.
// In the main method, create an array of Student objects and perform the following tasks:
// Prompt the user to enter the number of students.
// Create the Student objects and populate their information.
// Use a for loop to iterate through the array and call the printStudentInfo() method for each
// student.
// Find the student with the highest grade and print their information.
// Note: Remember to include appropriate comments and documentation throughout your code to
// make it more readable and maintainable.

import java.util.Scanner;
class Student{
	public String name;
	public char grade;
	public int age;

	//method to set the values of member variables
	public void setstudata(String n, char g, int a){
		name = n;
		grade = g;
		age = a;
	}

	//method to get the value of student name
	public String getname(){
		return name;
	}

	//method to get the value of student grade
	public char getgrade(){
		return grade;
	}

	//method to get the value of student age
	public int getage(){
		return age;
	}

	//method to increment the student's age by 1
	public int incrementAge(){
		int newage = age+1;
		return newage;
	}


	//method to print student information
	public void getstudata(){
		System.out.println("Student name: "+name);
		System.out.println("Student grade: "+grade);
		System.out.println("Student age: "+age);
	}


	//main driver method
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in); //scanner object created

		//takes input from user
		// System.out.println("Enter Number of students you want to enter details for: ");
		// int numstu = obj.nextInt();

		int numstu;
        do {
            System.out.println("Enter Number of students you want to enter details for: ");
            try {
                numstu = obj.nextInt();
				obj.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                obj.nextLine(); // Consume the invalid input
            }
        } while (true);


		Student[] s = new Student[numstu]; //student object array created

		//loop to go through the student object array and accept the values from user and initialize it.
		for(int i = 0; i<numstu; i++){
			s[i] = new Student();

			System.out.println("Enter name of "+(i+1)+" student:");
			String name = obj.nextLine();
			obj.nextLine();

            System.out.println();
			System.out.println("Enter Grade of "+(i+1)+" student, like (A, B, C, D):");
			char grade = obj.next().charAt(0);
			obj.nextLine();

			System.out.println("Enter age of "+(i+1)+" student:");
			int age = obj.nextInt();
			obj.nextLine();

			s[i].setstudata(name, grade, age);
			// System.out.println();
		}

		
		int ch;
		do{
			System.out.println("Select what operation you want to perform: ");
			System.out.println("press 1 to get all students information");
			System.out.println("press 2 to find out the highest grade student ");
			System.out.println("press 3 to increment a student's age");
			System.out.println("press 4 to exit");
			ch = obj.nextInt();
			switch(ch){
				case 1:
					//loop to print all student infromation
					System.out.println("Student information: ");
					for(Student student: s){
						student.getstudata();
						System.out.println();
					}
					break;
				case 2:
					//loop used to iterate through each student grade and find out the highest one
					Student highestgrade = s[0];
					for(int i=1; i<s.length; i++){
						if(s[i].getgrade()>highestgrade.getgrade()){
							highestgrade = s[i];
						}
					}

					System.out.println("Student with highest grade is: ");
					highestgrade.getstudata();
					break;
				case 3:
					System.out.println("Enter the student name whose age you want to increment: ");
					String sname = obj.nextLine();
					obj.nextLine();
					boolean found = false;
					for(int i=0; i<s.length; i++){
						if(s[i].getname().equals(sname)){
							System.out.println("the student's age incremented successfully");
							int newage = s[i].incrementAge();
							System.out.println("New age: "+ newage);
							found = true;
							break;
						}
					}
					if (!found) {
						System.out.println("Student not found.");
					}
					break;
				default:
					System.out.println("Enter a valid input!!");
					break;
			}
		}while(ch != 4);
		

	}
}