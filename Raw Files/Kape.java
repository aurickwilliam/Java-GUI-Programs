package javaPractice;
import java.util.*;
public class Kape {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter unit of Time: ");
    	String unitTime = input.nextLine();
    	
    	System.out.print("Enter the Value of time: ");
    	int ValueTime = input.nextInt();
    	
    	
    	if(unitTime.equalsIgnoreCase("Days") || (unitTime.equalsIgnoreCase("day")))  {
    		System.out.println("Hours: " + (24 * ValueTime));
    		System.out.println("Minutes: " + ((ValueTime * 24)*60));
    		System.out.println("Seconds: " + (((ValueTime * 24)*60)*60));
    	}else if(unitTime.equalsIgnoreCase("Hours") || (unitTime.equalsIgnoreCase("hour"))){
    		System.out.println("Days: " + (ValueTime /24));
    		System.out.println("Minutes: " + (ValueTime *60));
    		System.out.println("Seconds: " + ((ValueTime *60)*60));
    	}else if(unitTime.equalsIgnoreCase("Minutes") || (unitTime.equalsIgnoreCase("Minute"))) {
    		System.out.println("Days: " + ((ValueTime /60)/60));
    		System.out.println("Hours: " + (ValueTime /60));
    		System.out.println("Seconds: " + (ValueTime *60));
    	}else if(unitTime.equalsIgnoreCase("Seconds") || (unitTime.equalsIgnoreCase("Second"))) {
    		System.out.println("Days: " + (((ValueTime /60)/60)/24));
    		System.out.println("Hours: " + ((ValueTime /60)/60));
    		System.out.println("Minutes: " + (ValueTime /60));
    	}else {
    		System.out.println("Invalid Input");
    	}
    }
}
