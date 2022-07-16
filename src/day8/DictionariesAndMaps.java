package day8;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

public class DictionariesAndMaps {
	
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		final Map<String, Integer> phoneBook = new HashMap();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			phoneBook.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.next();
			// Write code here
			final Object phoneNumber = phoneBook.get(s);
			if (phoneNumber == null) {
				System.out.println("Not found");
			} else {
				System.out.println(s + "=" + phoneNumber);
			}
		}
		in.close();
	}
}