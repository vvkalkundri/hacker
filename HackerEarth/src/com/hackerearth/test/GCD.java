package com.hackerearth.test;

public class GCD {

	public static void main(String[] args) {
		int a = 2, b = 1;
		System.out.println("The GCD of 2 nos is :" + gcdFinder(a, b));

	}

	private static int gcdFinder(int a, int b) {
		int rem, quo;
		rem = (a > b ? a % b : b % a);
		quo = (a > b ? b : a);
		return (rem == 0 ? quo : gcdFinder(quo, rem));

	}
}
