package vetores_ex_final_correcao;

public class Rent {
	
	private String name;
	private String email;
	
	public Rent(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() { //Formatando a exibi��o dos dados
		return name + ", " + email;

	}
	
}
