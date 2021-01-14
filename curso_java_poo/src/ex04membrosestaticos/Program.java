package ex04membrosestaticos;

import java.util.Locale;
import java.util.Scanner;

import ex04membrosestatico_util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		
		double dollarPrice = CurrencyConverter.dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		
		double dollarsQuantity = CurrencyConverter.dollarsQuantity = sc.nextDouble();
		
		System.out.println(CurrencyConverter.converter(dollarPrice, dollarsQuantity));
		
		
		sc.close();

	}

}
