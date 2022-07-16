package day6;
import java.io.*;
import java.util.*;

public class LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	final Scanner scanner = new Scanner(System.in);
    	int testCases = Integer.parseInt(scanner.nextLine());
    	while (testCases-- > 0) {
    		final String s = scanner.nextLine();
    		for (int i = 0; i < s.length(); i++) {
    			if (i%2 == 0) {
    				System.out.print(s.charAt(i));
    			}
    		}
    		System.out.print(" ");
    		for (int i = 0; i < s.length(); i++) {
    			if (i%2 != 0) {
    				System.out.print(s.charAt(i) + "");
    			}
    		}
    		System.out.println();
    	}
    	scanner.close();
    	
    }
}