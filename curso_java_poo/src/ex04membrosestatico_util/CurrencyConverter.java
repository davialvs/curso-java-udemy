package ex04membrosestatico_util;

public class CurrencyConverter {

	public static double dollarPrice;
	public static double dollarsQuantity;
	public static double iof = 0.06;
	
	public static double converter(double dollarPrice, double dollarsQuantity) {
		return dollarPrice * dollarsQuantity * (1.0 + iof);
	}
	
	
}
