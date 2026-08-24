package Exercises;

import java.util.Scanner;

public class PP3_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1,y1: ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.println("Enter x2,y2: ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        scan.close();

        float Distance = (float) Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.println(Distance);



    }
}
