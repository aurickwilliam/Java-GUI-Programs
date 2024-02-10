package javaPractice;

import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String op;
		float num1, num2;
		System.out.print("Enter the operation(+,-,x,/) : ");
		op = s.nextLine();
		System.out.print("Enter the First number       : ");
		num1 = s.nextFloat();
		System.out.print("Enterthe Second the number   : ");
		num2 = s.nextFloat();
		System.out.println();
		
		switch(op){
			case "+":
				System.out.println("The Answer: " + (num1 + num2));
				break;
			case "-":
				System.out.println("The Answer: " + (num1 - num2));
				break;
			case "x":
				System.out.println("The Answer: " + (num1 * num2));
				break;
			case "/":
				System.out.println("The Answer: " + (num1 / num2));
				break;
			default:
				System.out.println("INVALID INPUT!!");
		}
		
		
	}

}
