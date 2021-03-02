package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Product {
	
	private Date moment;
	
	private OrderStatus status;
	
	public Product() {
		
	}

	public Product(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	//Methods
}
