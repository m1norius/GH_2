package main;

public class Controller {
	
	private Shape shape;
	
	public Controller(Shape shape){
		this.shape = shape;
	}
	
	public void action(String... parameter){
		if(Validator.isValidate(parameter)){
			shape.calculateArea(parameter);
			shape.calculatePerimeter(parameter);
		}else{
			System.out.println("Incorrect symbol");
		}
	}
}
