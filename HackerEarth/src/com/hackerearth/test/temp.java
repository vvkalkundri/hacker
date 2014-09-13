package com.hackerearth.test;

import java.util.ArrayList;
import java.util.List;

public class temp {
	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			a1.add(22);
		}
		while(true){
			if(a1.contains(22)){
				int tempindex = a1.indexOf(22);
				a1.remove(tempindex);
				
			}else{
				break;
			}
			
		}
			
		System.out.println(a1.size());

	}
}
