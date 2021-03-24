package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1; // chamando o m�todo da superclasse Employee com a palavra "super" e somando com additionalCharge * 1.1 (110%)
	}
}
