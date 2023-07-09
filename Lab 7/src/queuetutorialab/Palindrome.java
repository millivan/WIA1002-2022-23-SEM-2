package queuetutorialab;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
/**
 *
 * @author Ong Sim Ying
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        Queue queue = new LinkedList();
        for (int i = input.length()-1; i >=0; i--) {
            queue.add(input.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }
        if (input.equals(reverseString))
            System.out.println("The input " + input + " is a palindrome.");
        else
            System.out.println("The input " + input + " is not a palindrome.");
    }
}