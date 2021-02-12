package listas_ex_corrigido;

public class Employee {

		private Integer id; //wrapper class
		private String name;
		private Double salary;
		
		//Constructor
		public Employee () {
			
		}
		
		public Employee(Integer id, String name, Double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		
		// Getters and Setters
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getSalary() {
			return salary;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}
		
		//Methods
		public void increaseSalary(double percentage) {
			salary += salary * percentage / 100;
		}
		
		@Override
		public String toString() {
			return id + ", " + name + ", " + String.format("%.2f", salary);
		}
		
}
