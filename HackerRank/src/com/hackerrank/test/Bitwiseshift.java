package com.hackerrank.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bitwiseshift {
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		int highestZeros = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arrayLength = Integer.parseInt(br.readLine());
		String[] stringArray = br.readLine().split(" ");
		int[] mainArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			mainArray[i] = Integer.parseInt(stringArray[i]);
		}
		if (mainArray.length == arrayLength) {

			for (int i = 0; i < mainArray.length; i++) {
				List<Integer> al = new ArrayList<Integer>();

				al.add(mainArray[i]);
				for (int j = i + 1; j < mainArray.length; j++) {
					al.add(mainArray[j]);
					if (al.size() > 2) {
						int max1AfterConversionWithoutEnds = conversionWithoutEnds(al);
						int max1AfterConversionWithEnds = conversionWithEnds(al);
						if (max1AfterConversionWithoutEnds > highestZeros)
							highestZeros = max1AfterConversionWithoutEnds;
						if (max1AfterConversionWithEnds > highestZeros)
							highestZeros = max1AfterConversionWithoutEnds;
					}

				}
			}
		}
		System.out.println(highestZeros);
	}

	private static int conversionWithEnds(List<Integer> al) {
		String temp = "";
		for (Integer integer : al) {
			temp += integer.toString();
		}
		int tempLength = temp.length();
		Long temp1 = Long.valueOf(temp, 2);
		String convertedString = Long.toBinaryString(~temp1);
		return (getCountOfOnes(convertedString.substring(convertedString
				.length() - tempLength)));

	}

	private static int getCountOfOnes(String substring) {
		int sum = 0;
		for (int i = 0; i < substring.length(); i++) {
			sum += Character.getNumericValue(substring.charAt(i));
		}
		return sum;

	}

	private static int conversionWithoutEnds(List<Integer> al) {
		String temp = "";
		for (int i = 0; i < al.size(); i++) {
			if (i > 0 && i < al.size() - 1) {
				temp += al.get(i).toString();
			}
		}
		int tempLength = temp.length();
		Long temp1 = Long.valueOf(temp, 2);
		String convertedString = Long.toBinaryString(~temp1);
		return (getCountOfOnes(al.get(0).toString()
				+ convertedString.substring(convertedString.length()
						- tempLength) + al.get(al.size() - 1).toString()));

	}

}
