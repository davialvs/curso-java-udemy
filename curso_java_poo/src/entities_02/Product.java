package entities_02;

public class Product {
	
	public String name;
	public double price;
	public int quantity; // atributo da classe
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) { // parametro do método
		this.quantity += quantity;  // o this.quantity recebe o que já tinha nele + o quantity do parametro
									// this é uma palavra reservada que significa uma autoreferencia para o objeto (ou seja, atributo da classe)
								   
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { // Sobrepondo a versão .toString() padrão para criar a própria formatação
		return name
		+ ", $ "
		+ String.format("%.2f", price) // Formatando uma variavel com uma máscara
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
		}
}
