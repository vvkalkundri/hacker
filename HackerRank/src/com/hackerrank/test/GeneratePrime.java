package com.hackerrank.test;

import java.util.ArrayList;
import java.util.List;

public class GeneratePrime {
	public static void main(String[] args) {
		int limit = 1000;
		int primaryPrime = 2;
		boolean test;
		
		List<Integer> expectedPrime = new ArrayList<Integer>();
		expectedPrime.add(2);
		primaryPrime+=1;
		
		List<Integer> testPrime = new ArrayList<Integer>();
		testPrime.add(primaryPrime);
		
		List<Integer> skipSet = new ArrayList<Integer>();
		skipSet.add(2);
		
		while(primaryPrime < limit ){
			primaryPrime += skipSet.get(0);
			test = true;
			
		}
		

	}
}
