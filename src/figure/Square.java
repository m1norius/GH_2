package figure;

import main.Shape;

public class Square implements Shape{


	@Override
	public void calculateArea(String... parameter) {
				
		int square_area = (int)Math.pow(new Integer(parameter[0]), 2);
		int triangle_area = square_area / 2;
		System.out.println("Area: "+ square_area + ", Area of each triangles: "+triangle_area);
		
	}

	@Override
	public void calculatePerimeter(String... parameter) {
		
		int square_perimeter = 4 * new Integer(parameter[0]);
		int diagonal = (int) (Math.sqrt(2) * new Integer(parameter[0]));
		int triangle_perimeter = diagonal + 2 * new Integer(parameter[0]);
		System.out.println("Perimeter: "+ square_perimeter+", Perimeter of each triangles: " + triangle_perimeter);
		
	}

}
