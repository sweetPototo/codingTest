package day50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Solution {

	 public static int[] solution(int[] numbers) {
		 
		 HashSet<Integer> cal = new HashSet<>();
		 for(int i=0; i<numbers.length-1; ++i) {
			 for(int j=i+1; j<numbers.length; ++j) {
				 cal.add(numbers[i]+numbers[j]);
			 }
		 }
		 ArrayList<Integer> result = new ArrayList<>(cal);
		 Collections.sort(result);
		 return result.stream().mapToInt(Integer::intValue).toArray();
	 }
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		int[] result = solution(numbers);

		System.out.println(Arrays.toString(result));
	}

}
