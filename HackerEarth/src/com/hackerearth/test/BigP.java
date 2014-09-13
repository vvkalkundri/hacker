package com.hackerearth.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BigP {
	public static void main(String args[]) throws Exception {
		/*
		 * Read input from stdin and provide input before running
		 */
		
		 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			List<Integer> finalList = new ArrayList<Integer>();
			String[] inputSplit = br.readLine().split(" ");
			int noOfStudents = Integer.parseInt(inputSplit[0]);
			int noOfRelation = Integer.parseInt(inputSplit[1]);
			int numberOfslappedStudent = Integer.parseInt(inputSplit[2]);
			for (int k = 0; k < noOfRelation; k++) {
				String[] ele = br.readLine().split(" ");
				for (int j = 0; j < ele.length; j++) {
					int toBeAdded = Integer.parseInt(ele[j]);
					if (!finalList.contains(toBeAdded)) {
						finalList.add(toBeAdded);
					}
				}

			}
			for (int m = 0; m < numberOfslappedStudent; m++) {
				int slappedStudent = Integer.parseInt(br.readLine());

				if (finalList.contains(slappedStudent)) {
					int tempIndex = finalList.indexOf(slappedStudent);
					finalList.remove(tempIndex);
				}
			}
			System.out.println(finalList.size());
		}
 
	}
}