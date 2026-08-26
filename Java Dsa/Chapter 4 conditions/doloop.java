import java.util.Scanner;

public class doloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,lastDigit,reverse = 0;
        System.out.println("Enter a positive integer");
        number = input.nextInt();

        do{
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number/10;
        }while(number > 0);
        System.out.println("That number reserved is " + reverse);
    }
}
