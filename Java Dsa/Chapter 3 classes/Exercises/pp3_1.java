package Exercises;

import java.util.Random;
import java.util.Scanner;

public class pp3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter First Name: ");
        String fName  = scan.nextLine();
        System.out.println("Enter Last Name: ");
        String lName  = scan.nextLine();
        System.out.println(fName.substring(0,1) + lName.substring(0,5) + rand.nextInt(10,100));
        
    }
}
