package day26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1 {
	public int[] solution(int[] arr, int divisor) {
		List<Integer> res = new ArrayList<Integer>();
		for (int a : arr) {
			if (a % divisor == 0)
				res.add(a);
		}
		if (res.size() == 0) {
			int[] re = { -1 };
			return re;
		} else {
			Collections.sort(res);
			int[] result = res.stream().mapToInt(i -> i).toArray();
			return result;
		}
	}
}
