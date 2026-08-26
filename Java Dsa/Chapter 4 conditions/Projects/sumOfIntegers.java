package Projects;

import java.util.Scanner;

class sumOfIntegers {
public static void main(String[] args) {

    /*  Design and implement an application that reads an integer value
        and prints the sum of all even integers between 2 and the input
        value, inclusive. Print an error message if the input value is less
        than 2. Prompt accordingly. */
        
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an Integer: ");
    int num = input.nextInt();
    int sum = 0;

    if (num < 2) {
        System.out.println("Error: Input needs to be greater than 2");
    }
    else{
        for (int i = 2; i <= num; i=i+2) {
                sum += i;
        }
    }
    System.out.println(sum);
    input.close();
}
}