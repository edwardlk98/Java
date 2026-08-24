package Exercises;
public class Exercises {
    public static void main(String[] args) {
        /* 3.1 Write a statement that prints the number of characters in a
        String object called overview. */

        String s = "overview";
        System.out.println(s.length());

        /*3.2  Write a statement that prints the eighth character of a String
        object called introduction.*/

        System.out.println("introduction".substring(7,8));

        /* 3.4 Write a declaration for a String variable called change and initialize it to the characters stored in another String object called
            original with all 'e' characters changed to 'j'.*/

            String original = "This is an original text";

            String change = original.replace("e","j");
            System.out.println(change);

    }
}
