package com.hackerrank.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayCombinations {
	private static int tempArrayCounter = 0;

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		int[] temp = {};
		// for (int i = 0; i < a.length; i++) {
		int numberOfCombinations = 1;
		getAllCombinations(numberOfCombinations, a);
		// }
	}

	private static void getAllCombinations(int i, int[] a) {
		List<Integer> temp = new ArrayList<Integer>();
		for (int k = 0; k < a.length; k = k + i) {
			temp.add(a[k]);

		}
		System.out.println(temp);
	}
}
