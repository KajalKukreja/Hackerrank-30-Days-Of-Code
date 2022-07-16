package day26;

import java.io.*;
import java.util.*;

public class NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	final Scanner scanner = new Scanner(System.in);
    	int day1 = scanner.nextInt();
    	int month1 = scanner.nextInt();
    	int year1 = scanner.nextInt();
    	int day2 = scanner.nextInt();
    	int month2 = scanner.nextInt();
    	int year2 = scanner.nextInt();
    	final GregorianCalendar returnedDate = new GregorianCalendar(year1, month1-1, day1);
    	final GregorianCalendar dueDate = new GregorianCalendar(year2, month2-1, day2);
    	//System.out.println(returnedDate.getTime());
    	//System.out.println(dueDate.getTime());
    	System.out.println(calculateFine(returnedDate, dueDate));
    	scanner.close();    	
    }

	private static int calculateFine(GregorianCalendar returnedDate, GregorianCalendar dueDate) {
		
		if (returnedDate.before(dueDate)) {
			return 0;
		}
		
		if (returnedDate.get(GregorianCalendar.YEAR) == dueDate.get(GregorianCalendar.YEAR)) {
			if (returnedDate.get(GregorianCalendar.MONTH) == dueDate.get(GregorianCalendar.MONTH)) {
				return 15 * (returnedDate.get(GregorianCalendar.DAY_OF_MONTH) - dueDate.get(GregorianCalendar.DAY_OF_MONTH));
			} else {
				return 500 * (returnedDate.get(GregorianCalendar.MONTH) - dueDate.get(GregorianCalendar.MONTH));
			}
		} else {
			return 10000;
		}
	}
}