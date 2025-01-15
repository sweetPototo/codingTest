package day54;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	
	public static String solution(int[] food) {
		int count = 0;
        StringBuilder front = new StringBuilder();
        StringBuilder behind = new StringBuilder();
        for(int i=0; i<food.length; ++i) {
        	if(food[i] == 1) {
        		count++;
        		continue;
        	}else {
        		int dish = food[i]/2;
        		for(int j=0; j<dish; ++j) {
        			front.append(count);
        			behind.append(count);
        		}
        		count++;
        	}
        }
        front.append("0").append(behind.reverse());
        return front.toString();
    }

	public static void main(String[] args) {
		System.out.println("solution : " + solution(new int[] {1, 3, 4, 6}));

	}

}
