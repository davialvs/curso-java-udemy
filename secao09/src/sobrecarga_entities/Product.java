package sobrecarga_entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product() { //sobrecarga com construtor padrão
		
	}

	public Product(String name, double price, int quantity) { // O construtor vai atribuir os 3 parametros para os 3 atributos do objeto
		this.name = name; // this.name = referenciando ao atributo do objeto // this.name = name referencia o parametro do construtor
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) { //Sobrecarga = disponibilizar mais de uma versão da mesma operação
		this.name = name; 
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
