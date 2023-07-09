import java.util.*;

public class CheckPalindrome {
    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Input any string (at most 15 characters): ");
        String input = s.nextLine();
        while(input.length() > 15) {
            System.out.println("String must be at most 15 characters ");
            System.out.print("Input any string (at most 15 characters): ");
            input = s.nextLine();
        }

        Stack a = new Stack();


        for (int i = 0; i < input.length(); i++) {
            a.push(input.charAt(i));
        }
        String reverse = "";
        while (!a.isEmpty()) {
            reverse = reverse + a.pop();
        }
        if (input.equals(reverse)) {
            System.out.println( input + " is a palindrome");
        }
        else {
            System.out.println(input + " is not a palindrome");
        }
    }
}