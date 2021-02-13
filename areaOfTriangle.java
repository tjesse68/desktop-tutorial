package Week2;

import java.util.Scanner;

public class areaOfTriangle {

  
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	
		//prompt user to enter width of Triangle Base.
		System.out.println("enter Base-width of Triangle:");
		
		double base = scanner.nextDouble();
		
		//Prompt user to enter Height of Triangle.
		System.out.println("enter height of Triangle:");
		double height = scanner.nextDouble();
		
		//to get area of triangle you have to multiply 
		//the base width to the height and divide by 2.
		double area = (base*height)/2;
		System.out.println(" the area of the triangle is:"+ area);
		
		
		
		

	}

}
