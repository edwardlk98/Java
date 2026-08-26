package Projects;

import java.util.Scanner;

public class stringPerLine {
    /*Design and implement an application that reads a string from the
        user and prints it one character per line. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        Scanner strscan = new Scanner(str).useDelimiter(" ");

        while (strscan.hasNext()) {
            int index = 0;
            String str2 = strscan.next();
            while (index < str2.length()) {
                System.out.println(str2.charAt(index));
                index++;
            }
        }
        input.close();
        strscan.close();
    }
}
