package day53;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Solution {
	
	public static String[] solution(String[] strings, int n) {
		HashMap<String, String> stringMap = new HashMap<>();
		List<String> sort = new ArrayList<>();
		for(String s : strings) {
			String sortKey = String.valueOf(s.charAt(n));
			stringMap.put(sortKey, s);
			sort.add(sortKey);
		}
		sort.sort(Comparator.naturalOrder());
		String[] result = new String[strings.length];
		for(int i=0; i<strings.length; ++i) {
			System.out.println(i);
			result[i] = stringMap.get(String.valueOf(sort.get(i)));
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(solution(new String[] {"sun", "bed", "car"}, 1).toString());
	}
}
