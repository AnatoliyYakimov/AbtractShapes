package ru.yakimov;

public class Rectangle extends Shape {

	private double a;
	private double b;

	public Rectangle(double A, double B) {
		this.a = A;
		this.b = B;
	}

	@Override
	public double area() {
		return a * b;
	}

	@Override
	public String toString() {
		return String.format("Прямоугольник[a = %.2f, b = %.2f]", a, b);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
}
