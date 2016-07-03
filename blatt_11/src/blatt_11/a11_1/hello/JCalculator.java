package blatt_11.a11_1.hello;

public class JCalculator {
	public static int add(int x, int y) {
		return x + y;
	}

	public static int sub(int x, int y) {
		return x - y;
	}

	public static int mult(int x, int y) {
		return x * y;
	}

	public static double div(int x, int y) {
		if (y == 0) {
			throw new IllegalArgumentException("Böse 0!");
		}
		return (double) x / (double) y;
	}

	public static int round(double x) {
		return (int) Math.ceil(x);
	}
}
