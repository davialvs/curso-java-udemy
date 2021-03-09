package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthdate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthdate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next()); //valueOf converte o string para o valor correspondente definido no OrderStatus
		
		Order order = new Order(new Date(), status, client); //Order associado ao cliente
		
		System.out.println("How many items to this order? ");
		int n = sc.nextInt();
		
		//Percorrer os pedidos
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice); // Passo 1: Instanciar o produto
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem it = new OrderItem(quantity, productPrice, product); //Passo 2: Instanciar o item de pedido associado a esse produto

			order.addItem(it); //Passo 3: Adicionar o OrderItem dentro da Lista de Items (List<OrderItem>) do meu Pedido
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		sc.close();

	}

}
