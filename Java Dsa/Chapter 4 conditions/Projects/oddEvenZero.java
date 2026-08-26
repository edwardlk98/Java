package Projects;

import java.util.Scanner;

public class oddEvenZero {
    public static void main(String[] args) {
        /*Design and implement an application that reads a string from the
          user and prints it one character per line.  */

          Scanner input = new Scanner(System.in);
          System.out.println("Enter an integer Value: ");
          int val = input.nextInt();
          int odd=0;
          int even = 0;
          int zero = 0;

          do{
            int lastDigit = val % 10;
            val = val/10;
            if (lastDigit % 2 ==0) {
                even++;
            }
            if (lastDigit % 2 !=0) {
                odd++;
            }if (lastDigit == 0) {
                zero++;
            }

          }while(val>0);
          System.out.println("Number of even: " + even + " Number of odds: " + odd + " Number of zeros: "+ zero);
        input.close();

    }
}
