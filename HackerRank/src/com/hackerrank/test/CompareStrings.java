package com.hackerrank.test;

public class CompareStrings {
	public static void main(String[] args) {
		String str1 = "Hell";
		String str2 = "Heleo";
		// System.out.println((str1 != null) && (str2 != null)
		// && (str1.hashCode() == str2.hashCode()) && str1.equals(str2));
		int sum = 0;
		String a = "";
		for (int i = 0; i < str1.length(); i++) {
			System.out.println((int) str1.charAt(i));
			a += (int) str1.charAt(i);

		}
		System.out.println(" a :::" + a);
		sum = Integer.parseInt(a);
		System.out.println("SUm :::" + sum);
	}
}
