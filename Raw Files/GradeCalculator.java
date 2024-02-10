package javaPractice;

import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Math: ");
		int math = s.nextInt();
		System.out.print("English: ");
		int Eng = s.nextInt();
		System.out.print("Science: ");
		int sci = s.nextInt();
		System.out.print("Filipino: ");
		int fil = s.nextInt();
		System.out.print("ESP: ");
		int esp = s.nextInt();
		System.out.print("MAPEH: ");
		int mapeh = s.nextInt();
		System.out.print("AP: ");
		int ap = s.nextInt();
		System.out.print("TLE: ");
		int tle = s.nextInt();
		
		System.out.println();
		int average_add = math + Eng + sci + fil + ap + tle + mapeh + esp;
		float final_average = average_add / 8;
		System.out.println("Average: " + final_average);
		
		if(final_average > 100) {
			System.out.println("Invalid Grade!");
		}else if(final_average >= 98 && final_average <= 100){
			System.out.print("With Highest Honors");
		}else if(final_average >= 95 && final_average <= 97.99){
			System.out.print("With High Honors");
		}else if(final_average >= 90 && final_average <= 94.99){
			System.out.print("With Honors");
		}else if(final_average >= 75 && final_average <= 89.99){
			System.out.print("Passed");
		}else if(final_average < 75){
			System.out.print("Failed");
		}

	}

}
