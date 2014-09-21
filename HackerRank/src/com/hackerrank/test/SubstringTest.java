package com.hackerrank.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubstringTest {
	 static Map<String, Integer> distinctMap = new HashMap<String, Integer>();
	    private static int max = 0;
	    private static int resetCount = 0;
	    public static void main(String args[] ) throws Exception {

			Map<String, Integer> distinctMap = new HashMap<String, Integer>();	 

			Scanner sc = new Scanner(System.in);
			int noOfCharacters = sc.nextInt();
			int leftLimit = sc.nextInt();
			int rightLimit = sc.nextInt();
			int maxDistictCharacterCount = sc.nextInt();
			String actualString = sc.next();

			System.out.println(getMaxFrequentSubstrings(actualString, leftLimit, rightLimit,
					noOfCharacters));
		      
	 
	     }
	    private static int getMaxFrequentSubstrings(String actualString, int left,
				int right, int noOfCharacters) {
	        
	 		for (int i = left; i <= right; i++) {
				for (int j = 0; j < (noOfCharacters - i); j++) {
	                resetCount = 0;
	                String string =  actualString.substring(j, j + i);
	                if (distinctMap.containsKey(string))
						resetCount = distinctMap.get(string);

					distinctMap.put(string, resetCount + 1);
					if (resetCount + 1 > max) {
						max = resetCount + 1;
					}
				}
			}

			return max;
		}
}
