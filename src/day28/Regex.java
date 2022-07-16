package day28;

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

public class Regex {
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        final List<String> sortedNames = new ArrayList<>();
        final Pattern pattern = Pattern.compile(".*@gmail.com");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                String firstName = firstMultipleInput[0];
                String emailID = firstMultipleInput[1];
                if (pattern.matcher(emailID).matches()) {
                	sortedNames.add(firstName);
                }                	
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        Collections.sort(sortedNames);
        sortedNames.forEach(s -> System.out.println(s));
        bufferedReader.close();
    }
}
