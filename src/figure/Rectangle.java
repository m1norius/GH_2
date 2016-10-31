package figure;

import main.Shape;

public class Rectangle implements Shape {

	@Override
	public void calculateArea(String... parameter) {

		int rectangle_area = new Integer(parameter[0]) * new Integer(parameter[1]);
		int triangle_area = rectangle_area / 2;
		System.out.println("Area: "+ rectangle_area + ", Area of each triangles: "+triangle_area);	
		
	}

	@Override
	public void calculatePerimeter(String... parameter) {
		
		int rectangle_perimeter = 2 * (new Integer(parameter[0]) + new Integer(parameter[1]));
		int diagonal = (int) Math.sqrt(        Math.pow(new Integer(parameter[0]), 2)       +     Math.pow(new Integer(parameter[1]), 2)      );
		int triangle_perimeter =  diagonal + new Integer(parameter[0]) + new Integer(parameter[1]);
		System.out.println("Perimeter: "+ rectangle_perimeter+", Perimeter of each triangles: " + triangle_perimeter);
		
	}

}
