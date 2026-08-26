package Projects;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        /* Design and implement an application that reads an integer value
        representing a year from the user. The purpose of the program is
        to determine whether the year is a leap year (and therefore has 29
        days in February) in the Gregorian calendar. A year is a leap year if
        it is divisible by 4, unless it is also divisible by 100 but not 400. For
        example, the year 2003 is not a leap year, but 2004 is. The year
        1900 is not a leap year because it is divisible by 100, but the year
        2000 is a leap year because even though it is divisible by 100, it is
        also divisible by 400. Produce an error message for any input value
        less than 1582 (the year the Gregorian calendar was adopted).*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        boolean leapyear;
        if (year < 1582) {
            System.out.println("Error: Gregorian calendar was adopted in 1582");
        }else{
            leapyear = (year % 4 ==0)&& (year % 100!=0 || year % 400==0);
            if (leapyear) {
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
        }
        input.close();
    }
}
