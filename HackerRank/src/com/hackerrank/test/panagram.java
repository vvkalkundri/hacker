package com.hackerrank.test;

import java.util.HashMap;
import java.util.Map;

public class panagram {
	private static String PANAGRAM = "pangram";
	private static String NOTPANAGRAM = "not pangram";
	private static int TOTALVALUE = 2847;

	public static void main(String[] args) {
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		int total = 0;
		String input = "abc".toLowerCase().replace(" ", "");
		for (int i = 0; i < input.length(); i++) {
			m1.put(input.charAt(i), 1);
		}
		for (Character key : m1.keySet()) {
			total += (int) key;

		}
		System.out.println(total);
	}
}
