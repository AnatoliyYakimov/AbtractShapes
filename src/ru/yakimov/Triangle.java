package ru.yakimov;

public class Triangle extends Shape {

	//Высота треугольника
	private double height;

	//Основание треугольника
	private double a;

	public Triangle(double height, double a) {
		this.height = height;
		this.a = a;
	}

	@Override
	public double area() {
		return 1 / 2. * height * a;
	}

	@Override
	public String toString() {
		return String.format("Треугольник[Высота = %.2f, Основание = %.2f]", height, a);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}
}
