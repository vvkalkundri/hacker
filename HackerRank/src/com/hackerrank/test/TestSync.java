package com.hackerrank.test;

import java.util.Scanner;

public class TestSync {

	public static void main(String[] args) {
		// Scanner keysIn = new Scanner(System.in);
		// System.out.print("Please enter your number: ");
		// // String a = "1234";
		// System.out.println(a.substring(a.length()-2));
		// System.out.println("-----------");

		// long originalNum = keysIn.nextLong(2); // specify radix of 2
		//
		//
		// String finalString = Long.toBinaryString(~originalNum);
		// int finalStringLength = Long.toBinaryString(~originalNum).length();
		// System.out.println(finalStringLength-originalLen);
		// System.out.println(finalString.substring((finalStringLength-originalLen)));

		String str = "abcd";
		int k = 0;
		while (k < str.length()) {
			for (int i = k; i <= str.length(); i++) {
				System.out.println( str.substring(k, i));
			}
			k++;
		}

		// keysIn.close();
	}

}
