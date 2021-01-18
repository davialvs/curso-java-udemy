package encapsulamento_entities;

public class Product {

	private String name; //private significa que os atributos não podem ser acessados por outras classes
	private double price;
	private int quantity;

	//construtores
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
	
	//getters e setters (depois dos construtores)
	public String getName() { //método para acessar o atributo "name" (ambos devem ser do mesmo tipo)
		return name; //retorna o atributo
	}
	
	public void setName(String name) { //altera o valor (não retorna nada) e recebe um valor tipo String como parametro
		this.name = name; // o método atribui para o atributo do objeto o valor recebido
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	
	//métodos
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
