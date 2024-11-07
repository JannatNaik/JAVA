//Declare variables of different data types (int, double, boolean, char) and perform various
//arithmetic operations on them.

class datatype{
	public static void main(String args[]){
		int intnum1 = 10;
		int intnum2 = 20;
		
		double doublen1 = 12.3;
		double doublen2 = 14.4;
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		char ch1 = 'J';
		char ch2 = 'A';
		
		//arithmetic operations on integer variables
		int sum = intnum1 + intnum2;
		int sub = intnum1 - intnum2;
		int mul = intnum1 * intnum2;
		int quotient = intnum1 / intnum2;
		int remainder = intnum1 % intnum2;
		
		//arithmetic operations on double type variables
		double dadd = doublen1 + doublen2;
		double dsub = doublen1 - doublen2;
		double dmul = doublen1 * doublen2;
		double ddiv = doublen1 / doublen2;
		
		//boolean operations
		boolean b1 = bool1 && bool2;
		boolean b2 = bool1 || bool2;
		boolean b3 = !bool1;
		
		//char
		//char merge = ch1+ch2;
		int addchar = ch1+ch2;
		int chardiff = ch1-ch2;
		
		System.out.println("arithmetic operations on integer: "+intnum1+" and "+intnum2);
		System.out.println("addition of integer: "+sum);
		System.out.println("subtraction of integer: "+sub);
		System.out.println("multiplication of integer: "+mul);
		System.out.println("quotient of integer: "+quotient);
		System.out.println("remainder of integer: "+remainder);
		
		System.out.println("arithmetic operations on double: "+doublen1+" and "+doublen2);
		System.out.println("addition: "+dadd);
		System.out.println("subtraction: "+dsub);
		System.out.println("multiplication: "+dmul);
		System.out.println("division: "+ddiv);
		
		System.out.println("boolean operations: ");
		System.out.println("and operation: "+b1);
		System.out.println("or operation: "+b2);
		System.out.println("not operation: "+b3);
		
		System.out.println("character operations on: "+ch1+" and "+ch2);
		//System.out.println("merging two characters: "+merge);
		System.out.println("adding ASCII values of those characters: "+addchar);
		System.out.println("Difference between their ASCII values: "+chardiff);
	}
		
}