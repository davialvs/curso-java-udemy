package membrosestaticos02_util;

public class Calculator {

	public final double PI = 3.14159; // (constante)

	public double circumference(double radius) { // sem método estático (static)
		return 2.0 * PI * radius;
	}

	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
