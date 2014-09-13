package com.hackerearth.test;

public class PowerSetGeneration {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < 5; i++) {
			int combinations = i + 1;
			nChooseK(array, combinations);
		}

	}

	private static void nChooseK(int[] array, int k) {
		recurse("", array, k);
	}

	private static void recurse(String initialString, int[] array, int k) {
		if (k == 0) {
			System.out.println(initialString);
			return;
		}
		for (int i = 0; i < array.length; i++) {
			int[] tempArray = new int[(array.length - 1) - i];
			int m = 0;
			for (int j = i + 1; j < array.length; j++)
				tempArray[m++] = array[j];

			recurse(initialString + array[i], tempArray, k - 1);
		}
	}
}
