// Write a BankAccount class with the following properties: accountNumber, balance,
// and owner. Implement methods to deposit, withdraw, and check the account balance.
import java.util.Scanner;
class bankacc{
	public String accountNumber;
	public double balance;
	public String owner;

	public bankacc(String accnum, double bal, String own){
		accountNumber = accnum;
		balance = bal;
		owner = own;
	}

	public boolean isNumeric(double num){
		 try {
	    } catch (NumberFormatException e) {
	        return false;
	    }
	    return true;
	}

	public void deposit(double depoamt){
		if(depoamt != 0 && isNumeric(depoamt)){
			this.balance = this.balance+depoamt;
			System.out.println("Amount deposited successfully!!");
			System.out.println("current balance: "+balance + "Rs.");
		}else{
			System.out.println("Enter a valid input!!!");
		}
	}

	public void withdraw(double withamt){
		if(withamt !=0 && isNumeric(withamt)){
			this.balance = this.balance - withamt;
			System.out.println("Amount withdarwed successfully!");
			System.out.println("current balance: "+balance + "Rs.");
		}else{
			System.out.println("enter a valid input!!!");
		}
	}

	public void checkbal(){
		System.out.println("Your details: ");
		System.out.println("Account owner: "+ owner);
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Account balance: "+ balance + "Rs.");
	}

	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter account number: ");
		String accnum = obj.nextLine();

		System.out.println("Enter your name: ");
		String owner = obj.nextLine();

		System.out.println("Enter balance: ");
		double balance = obj.nextDouble();

		bankacc a1 = new bankacc(accnum, balance, owner);

		System.out.println("What operation do you want to perform? select an option from below:");
		System.out.println("Press 1 to check Account balance");
		System.out.println("Press 2 to withdraw Amount");
		System.out.println("Press 3 to deposit Amount");
		int ch = obj.nextInt();

		switch(ch){
			case 1:
				System.out.println("Your Account details: ");
				a1.checkbal();
				break;
			case 2:
				System.out.println("Enter Amount to be withdrawn: ");
				double withamt = obj.nextDouble();
				if(withamt>0 && withamt<balance && a1.isNumeric(withamt)){
					a1.withdraw(withamt);
				}else{
					System.out.println("Enter a valid amount!!");
				}
				break;
			case 3:
				System.out.println("Enter Amount to be deposited: ");
				double depoamt = obj.nextDouble();
				if(depoamt>0 && depoamt<balance && a1.isNumeric(depoamt)){
					a1.deposit(depoamt);
				}else{
					System.out.println("Enter a valid amount!!");
				}
				break;
			default:
				System.out.println("Enter a valid input!!");
		}
	}
}