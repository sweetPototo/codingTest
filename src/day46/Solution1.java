package day46;

import java.util.*;

public class Solution1 {
	public static void main(String[] args) {
		int n = 24;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; ++i) {
			if (n % i == 0) {
				list.add(i);
			}
		}
//		int[] answer = new int[list.size()];
//		for (int i = 0; i < list.size(); ++i) {
//			answer[i] = (int) list.get(i);
//		}
		int[] answer = list.stream().mapToInt(x -> x).toArray();
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(answer[i]);
		}
	    
	}
}
