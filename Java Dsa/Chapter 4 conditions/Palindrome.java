import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word: ");
        String word = scan.nextLine();

        int index = word.length()-1;
        String newWord = "";

        while (index >= 0 ) {
            newWord += word.charAt(index);
            index--;
        }
        if (word.equalsIgnoreCase(newWord)) {
            System.out.println("Yes palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
        scan.close();
    }
}
