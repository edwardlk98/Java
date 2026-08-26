import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();
        int left = 0;
        int right = word.length()-1;
        while ( left < right & word.charAt(left)== word.charAt(right)) {
            System.out.println(left + " "+ right);
            left++;
            right--;        
            }
            
            if (left<right) {
                System.out.println("Not a Palindrome");
            }else{
                System.out.println("This is a Palindrome");
            }

    }
}
