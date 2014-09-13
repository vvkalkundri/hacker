package com.hackerearth.test;

public class trial {
	public static void main(String[] args) {
		String test = "aabbccdd";
		String finalString = "";
		char[] a = test.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a[i + 1]) {
				finalString += a[i];
				i++;
			}
		}
		System.out.println(finalString);

	}

}
