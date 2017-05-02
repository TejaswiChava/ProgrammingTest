package Polynomial;

public interface Iquad {
	public void setQuad(double newX1, double newX2, double newX3, double newX4);
	public double getX1();
	
	public double getX2();
	public double getX3();
	public double getX4();
	public Quad solveBiquadratic(double a, double b, double c);

}
