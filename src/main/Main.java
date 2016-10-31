package main;

import java.util.Scanner;

import figure.Circle;
import figure.Rectangle;
import figure.Square;
import figure.Triangle;

public class Main {
	
	private Circle circle;
	private Rectangle rectangle;
	private Square square;
	private Triangle triangle;
	
	

	public static void main(String[] args) {
	
		while(true){
			switch (new Scanner(System.in).nextLine()) {
						
			case "Circle":
				Controller c = new Controller(new Circle());
				System.out.println("Input radius: ");
				c.action(new Scanner(System.in).nextLine());
				break;
			case "Rectangle":
				Controller c_1 = new Controller(new Rectangle());
				System.out.println("Input height and width: ");
				c_1.action(new Scanner(System.in).nextLine(), new Scanner(System.in).nextLine());
				break;
			case "Square":
				Controller c_2 = new Controller(new Square());
				System.out.println("Input height or width: ");
				c_2.action(new Scanner(System.in).nextLine());
				break;
			case "Triangle":
				Controller c_3 = new Controller(new Triangle());
				System.out.println("Input sides of the triangle: a, b, c: ");
				c_3.action(new Scanner(System.in).nextLine(), new Scanner(System.in).nextLine(),new Scanner(System.in).nextLine());
				break;
			default:
				System.out.println("Unknown figure, try again");
				break;
			}
		}	
	}
}
