import java.lang.*;
import java.text.NumberFormat;
import java.util.Scanner;
public class formating {
    public static void main(String[] args) {
        int num1 = 5;
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        System.out.println(fmt1.format(num1));

        /*  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name = scan.nextLine();
        

        System.out.println("Enter Id: ");
        int Id = scan.nextInt();
        
        System.out.printf("Id: %5d\tname: %s", Id, name);
    }
}
