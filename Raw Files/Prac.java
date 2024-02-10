package javaPractice;

import java.util.Scanner;
public class Prac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] username = { "Inzhagi", "POGI", "Vincenzo", "Zinu", "Joma" };
        String[] password = { "IBONN", "AKO", "Mafia", "Emma", "Tech" };

        System.out.println("LOG IN : \n");

        System.out.print("Username : ");
        String user = input.nextLine();

        System.out.print("Password : ");
        String pass = input.nextLine();

        boolean userInput = false;

        for (String x : username) {
            if (x.equals(user)) {
                userInput = true;
                break;
            } else
                userInput = false;
        }
        boolean passinput = false;
        for (String y : password) {
            if (y.equals(pass)) {
                passinput = true;
                break;
            } else
                passinput = false;
        }

        if (userInput && passinput)
            System.out.println("ACCESS GRANTED, WELCOME " + user);
        else
            System.out.println("ERROR!!!");

    }
    
}