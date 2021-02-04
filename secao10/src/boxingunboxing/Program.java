package boxingunboxing;

public class Program {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x; // ou Integer obg = x; // Dessa forma o casting não é necessário 
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
	}

}
