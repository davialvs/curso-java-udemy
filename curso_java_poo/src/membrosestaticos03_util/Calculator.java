package membrosestaticos03_util;

public class Calculator {

	public static final double PI = 3.14159;

	public static double circumference(double radius) { // Necessita do "static" pois se trata de membros estáticos (que não vão ser alterados)
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
