package currencyFormatter;

import java.util.*;
import java.text.*;
/**
 * Problem no 1 : Given a double-precision number, denoting an amount of money, 
 * use the NumberFormat class' getCurrencyInstance method to convert into the US, 
 * Indian, Chinese, and French currency formats. Then print the formatted values as follows:
 * 
 *	US: formattedPayment
 *	India: formattedPayment
 *	China: formattedPayment
 *	France: formattedPayment
 * @author shafiz
 *
 */
public class CurrencyFormatter {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		//This is one kind of solution.Because indian currency sign is not in the locale
		//we can do it in other way
		
		/*String varat = NumberFormat.getInstance().format(payment);
		String in = "Rs.";
		String india = in+varat;*/
		//We can do currency format for India like following and above is also correct
		String india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		String bangladesh = NumberFormat.getInstance().format(payment);
		////There is another method
		
		//...........
		
		Currency currency = Currency.getInstance("BDT");
		NumberFormat format = NumberFormat.getInstance();
		format.setCurrency(currency);
		
		//Outputting result
		Currency currencySign = format.getCurrency();
		//String Bangladesh = NumberFormat.getCurrencyInstance(new Locale("bn","bn")).format(payment);
		System.out.println("US: "+us);
		System.out.println("India: "+india);
		System.out.println("China: "+china);
		System.out.println("France: "+france);
		System.out.print(format.getCurrency());
		System.out.println("Bangladesh: "+currencySign +" "+bangladesh);
		
	}		
}
