package figure;

import main.Shape;

public class Circle implements Shape{

	@Override
	public void calculateArea(String... parameter) {

		int circle_area = (int) (2 * Math.PI * Math.pow(new Integer(parameter[0]), 2));
		System.out.println("Area: "+circle_area);

	}

	@Override
	public void calculatePerimeter(String... parameter) {
		
		int circle_area = (int) (2 * Math.PI * new Integer(parameter[0]));
		System.out.println("Perimeter: "+circle_area);

	}
}
