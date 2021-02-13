package Week2;


import java.util.Scanner;


public class CircumfrenceRatioCalculator {
       
	
	static Scanner sc = new Scanner(System.in);
       
	public static void main(String[] args) {
		
     //Prompt user to enter radius of circle.
		
		
		System.out.println( "Enter radius:");
           
	 // Radius can be double so we will store it as double.
		double radius = sc.nextDouble();
		
	 //Area = PI*radius*radius
		double area = Math.PI * (radius*radius);
		System.out.println("The area of circle is:"+area);
		//Circumference=2*PI*radius
		double circumference= Math.PI* 2*radius;
		System.out.println(" The circumfrence of the circle is:" + circumference );
		
		
		
		
		
		
		
		
		
		
		
	}

}
