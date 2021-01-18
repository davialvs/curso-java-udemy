package sobrecarga;

import java.util.Locale;
import java.util.Scanner;

import sobrecarga_entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();

		Product product = new Product(name, price); //Construtor de sobrecarga

		System.out.println();
		System.out.println("Product data: " + product.toString());
		System.out.println();

		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product.toString());
		System.out.println();

		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product.toString());

		sc.close();

	}

}
