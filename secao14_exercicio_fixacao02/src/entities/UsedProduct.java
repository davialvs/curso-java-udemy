package entities;

import java.util.Date;

public class UsedProduct extends Product{
	
	private Date manufactureDate;
	
	public UsedProduct() {
		
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	
}
