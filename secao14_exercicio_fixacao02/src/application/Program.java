package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> listaDeProdutos = new ArrayList<>();
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char ch = sc.next().charAt(0); //pega a primeira letra digitada
			System.out.println("Name: ");
			sc.nextLine(); //consumindo o nextLine pendente
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (ch == 'c') {
				Product product = new Product(name, price);
				listaDeProdutos.add(product); //adicionar o produto na lista
			} else if (ch == 'u'){
				System.out.print("Manufacture date (DD/MM/YYYY):");
				Date manufactureDate = sdf.parse(sc.next());
				Product product = new UsedProduct(name, price, manufactureDate);
				listaDeProdutos.add(product);
			} else {
				System.out.print("Customs fee:");
				double customsFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customsFee);
				listaDeProdutos.add(product);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product product : listaDeProdutos) { //para cada emp na minha lista de funcionarios faça:
			System.out.println(product.priceTag());
		}
		
		sc.close();
		
	}
}