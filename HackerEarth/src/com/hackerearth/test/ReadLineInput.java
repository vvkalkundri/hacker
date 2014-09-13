package com.hackerearth.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadLineInput {
	public static void main(String[] args) throws Exception {
		int count = 0, gcdVal;
		String Winner = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noOfIterations = Integer.parseInt(br.readLine());
		for (int i = 0; i < noOfIterations; i++) {
			String[] testCase = br.readLine().split(" ");
			int A = Integer.parseInt(testCase[0]);
			int B = Integer.parseInt(testCase[1]);
			if(A==1 && B==1){
				System.out.println("Draw");
				continue;
			}
			gcdVal = gcdFinder(A, B);
			if(A==B && B == gcdVal){
				System.out.println("Arjit");
				continue;
			}
			
			if (gcdVal > 1 || gcdVal == 1) {
				B = B - 1;
			}

			if (B == 1 || B == 0 ) {
				System.out.println("Arjit");
				continue;
			}

			gcdVal = gcdFinder(A, B);
			if(A==B && B == gcdVal){
				System.out.println("Chandu Don");
				continue;
			}
			if (gcdVal > 1 || gcdVal == 1) {
				A = A - 1;
			}

			if (A == 1 || A == 0 || (A==B && B == gcdVal)) {
				System.out.println("Chandu Don");
			}

		}

	}

	private static int gcdFinder(int a, int b) {
		int rem, quo;
		rem = (a > b ? a % b : b % a);
		quo = (a > b ? b : a);
		return (rem == 0 ? quo : gcdFinder(quo, rem));

	}

}
