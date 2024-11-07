// Problem 1: Currency Converter
// Write a program that can convert between different currencies. The program should have the
// following features:
//  Prompt the user to enter the amount they want to convert.
//  Provide a list of available currencies (e.g., USD, EUR, JPY, GBP, INR) and ask the user to select
// the source and target currencies.
//  Implement the currency conversion logic using appropriate exchange rates.
//  Display the converted amount to the user.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class CurrencyConverter{
	public static final Map<String, Double> exchangerate = new HashMap<>();

	static{
		exchangerate.put("USD", 1.0);
        exchangerate.put("EUR", 0.9);
        exchangerate.put("JPY", 114.0);
        exchangerate.put("GBP", 0.8);
        exchangerate.put("INR", 78.0);
	}

	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the amount to be converted: ");
		double amount = obj.nextDouble();

		System.out.println("Available currencies: ");
		for (String currency : exchangerate.keySet()){
			System.out.println(currency);
		}


		System.out.println("Enter the source currency (e.g., USD, EUR, JPY, GBP, INR): ");
		String source = obj.nextLine();
		obj.nextLine();

		if(!exchangerate.containsKey(source)){
			System.out.println("Enter a valid currency!!!");
			return;
		}

		System.out.println("Enter the target currency: ");
		String target = obj.nextLine();
		obj.nextLine();

		if(!exchangerate.containsKey(target)){
			System.out.println("Enter a valid currency!!!");
			return;
		}

		double conversionrate = exchangerate.get(target)/ exchangerate.get(source);
		double convertedamt = amount*conversionrate;

		System.out.printf("%.2f %s is equivalent to %.2f %s\n", amount, source, convertedamt, target);


	}
}