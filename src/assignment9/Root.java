package assignment9;

import java.util.Scanner ;

public class Root {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		System.out.print("Enter a Number:");
		
		double number = a.nextInt();
				double squareRoot = Math.sqrt(number);
				double cubeRoot = Math.cbrt(number);
		System.out.println("number is"+ number);
		System.out.println("square root of "+number+" is " + squareRoot);
		System.out.println("Cube  root of "+number+ " is " + cubeRoot);
	}

}
