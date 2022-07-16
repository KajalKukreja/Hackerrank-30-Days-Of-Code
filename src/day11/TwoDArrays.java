package day11;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class TwoDArrays {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        System.out.println(getMaxHourGlassSum(arr));
        
        bufferedReader.close();
    }

	private static int getMaxHourGlassSum(List<List<Integer>> arr) {
		int maxSum = 0;
		for (int i = 0; i < arr.size()-2; i++) {
			for (int j = 0; j < arr.size()-2; j++) {
				int firstRow = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
				int secondRow = arr.get(i+1).get(j+1);
				int thirdRow = arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
				int sum = firstRow + secondRow + thirdRow;
				if ((i == 0 && j == 0) || sum > maxSum) {
					maxSum = sum;
				}
				
				//System.out.println(arr.get(i).get(j) + " " + arr.get(i).get(j+1) + " " + arr.get(i).get(j+2));
				//System.out.println(" " + arr.get(i+1).get(j+1) + " ");
				//System.out.println(arr.get(i+2).get(j) + " " + arr.get(i+2).get(j+1) + " " + arr.get(i+2).get(j+2));
				//System.out.println(firstRow + "  " + secondRow + "  " + thirdRow);
				//System.out.println("===============");
			}
		}
		return maxSum;
	}
}
