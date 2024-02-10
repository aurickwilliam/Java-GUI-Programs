package javaPractice;
import java.util.Scanner;
public class Grade_Calcu {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.println("Enter your grades");

        System.out.print("Filipino : ");
        int fil = Input.nextInt();
        System.out.print("English  : ");
        int eng = Input.nextInt();
        System.out.print("Math     : ");
        int math = Input.nextInt();
        System.out.print("Science  : ");
        int sci = Input.nextInt();
        System.out.print("AP       : ");
        int ap = Input.nextInt();
        System.out.print("ESP      : ");
        int esp = Input.nextInt();
        System.out.print("TLE      : ");
        int tle = Input.nextInt();
        System.out.print("MAPEH    : ");
        int mapeh = Input.nextInt();

        System.out.println();

        int average = fil + eng + math + sci + esp + tle + mapeh + ap;
        double final_average = average / 8;

        System.out.println("The Average Grade is " + final_average);
        if(final_average > 100) System.out.println("INVALID GRADE!!!");
        else if (final_average >= 98) System.out.println("With Highest Honors");
        else if (final_average >= 95) System.out.println("With High Honors");
        else if (final_average >= 90) System.out.println("With Honors");
        else System.out.println("No Honors");
    }
}
