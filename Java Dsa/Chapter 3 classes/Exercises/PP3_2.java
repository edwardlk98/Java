package Exercises;

import java.util.Scanner;

public class PP3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two Number seperate by space ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();


        System.out.println(Math.pow(num1, 3)+  Math.pow(num2, 3));
    }
}
