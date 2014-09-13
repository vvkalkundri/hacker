package com.hackerearth.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class KaranStrings {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int in = Integer.parseInt(br.readLine());
		if (in >= 1 && in <= 100) {
			List<String> inputs = new ArrayList<String>();
			for (int i = 0; i < in; i++) {
				inputs.add(br.readLine());
			}
			List<String> output = new ArrayList<String>();
			for (String out : inputs) {
				output.add(ComputeResult(out));
			}

			for (String finalString : output) {
				System.out.println(finalString);

			}

		}
	}

	private static String ComputeResult(String str) {
		String finalOutput = "";
		if (str.length() >= 1 && str.length() <= 1000000) {
			char[] charArray = str.toCharArray();
			for (int j = 0; j < charArray.length; j++) {

				if ((j + 1 < charArray.length)
						&& (charArray[j] == charArray[j + 1])) {

					continue;
				} else {
					finalOutput += charArray[j];
				}
			}
		}
		return finalOutput;
	}

}
