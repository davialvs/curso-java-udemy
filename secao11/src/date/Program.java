package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //Instanciação do objeto SimpleDateFormat
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		
		Date x1 = new Date(); //Pega a hora atual
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		

		Date y1 = sdf1.parse("16/02/2021"); //variavel do tipo Date. parse recebe um dado do tipo string e converte para data
		Date y2 = sdf2.parse("16/02/2021 16:49:02");
		Date y3 = Date.from(Instant.parse("2021-02-16T15:42:07Z")); //Formato ISO 8601 
		
		
		System.out.println("y1: " + y1);
		System.out.println("y2: " + sdf2.format(y2)); //Imprimindo no formato sdf2
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3)); 
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("----------------------");
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2)); //Imprimindo no formato sdf3
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3)); 
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("----------------------");
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2); 
		System.out.println("y3: " + y3);
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3); 
		System.out.println("x4: " + x4);
	}

}
