package figure;

import main.Shape;

public class Triangle implements Shape {
	
	private int a;
	private int b;
	private int c;
		
	private boolean isValidateForExistence(){
		
		if(a + b > c && a + c > b && c + b > a){
			return true;
		}
		return false;
	}

	@Override
	public void calculateArea(String... parameter) {
		
		a = new Integer (parameter[0]);
		b = new Integer (parameter[1]);
		c = new Integer (parameter[2]);
		
		if(isValidateForExistence()){
			int triangle_area = (int) Math.sqrt((a+b+c)*(b+c-a)*(a+c-b)*(a+b-c));
			System.out.println("Area: "+triangle_area);
		}
	}

	@Override
	public void calculatePerimeter(String... parameter) {
		
		if(isValidateForExistence()){
			int triangle_perimeter = a + b + c;
			System.out.println("Perimeter: "+triangle_perimeter);
		}else {
			System.out.println("Triangle does not exist");
		}	
	}
}
