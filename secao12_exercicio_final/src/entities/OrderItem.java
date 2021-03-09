package entities;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	
	private Product product; // Um item de pedido (OrderItem) tem N produtos (Product)
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	//Methods
	public double subTotal() {
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return getProduct().getName() //Pegando o elemento name do produto (product)
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}
