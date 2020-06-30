package ru.yakimov;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();

		shapes.add(new Circle(10));
		shapes.add(new Rectangle(3, 4));
		shapes.add(new Triangle(1,3));

		for (int i = 0; i < shapes.size(); i++) {
			Shape currentShape = shapes.get(i);

			System.out.println(currentShape);
			System.out.printf("Площадь данной фигуры равна %.2f\n\n", currentShape.area());
		}
	}

}
