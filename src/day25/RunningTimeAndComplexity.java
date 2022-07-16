package day25;

import java.io.*;
import java.util.*;

public class RunningTimeAndComplexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	final Scanner scanner = new Scanner(System.in);
    	int testCases = Integer.parseInt(scanner.nextLine());
    	while (testCases-- > 0) {
    		if (isPrime(Integer.parseInt(scanner.nextLine()))) {
    			System.out.println("Prime");
    		} else {
    			System.out.println("Not prime");
    		}
    	}
    	scanner.close();
    }

	private static boolean isPrime(int n) {

		//Anything less than or equal to 1 is not prime
		if (n <= 1) {
			return false;
		}
		
		//Because we know 2 is prime
		if (n == 2) {
			return true;
		}
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i == 0) {
				return false;
			}
		}
		return true;
	}
}