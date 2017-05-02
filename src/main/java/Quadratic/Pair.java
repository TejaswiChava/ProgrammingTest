package Quadratic;

public class Pair implements Ipair {
	double x1, x2;

	public Pair() {
		x1 = Double.NaN;
		x2 = Double.NaN;
	}

	public Pair(double newX1, double newX2) {
		x1 = newX1;
		x2 = newX2;
	}

	public void setPair(double newX1, double newX2) {
		x1 = newX1;
		x2 = newX2;
	}

	public double getX() {
		return x1;
	}

	public double getY() {
		return x2;
	}

	public Pair solveQuadratic(double a, double b, double c) {

		double discriminant = b * b - 4 * a * c;
		if (discriminant < 0)
			return new Pair();
		return new Pair((-b + Math.sqrt(discriminant)) / (2 * a), (-b - Math.sqrt(discriminant)) / (2 * a));
	}

}
