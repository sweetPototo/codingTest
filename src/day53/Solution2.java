package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Solution2 {
	public static String[] solution(String[] strings, int n) {
		List<HashMap<String, String>> keyList = new ArrayList<>(); //map으로 key, value 지정해서 list에 저장
		for(String s : strings) {
			HashMap<String, String> stringMap = new HashMap<>();
			String sortKey = String.valueOf(s.charAt(n));
			stringMap.put(sortKey, s);  //n번째 문자 : 해당 단어
			keyList.add(stringMap);
		}
		keyList.sort((map1, map2) -> {
			String key1 = map1.keySet().iterator().next();
			String key2 = map2.keySet().iterator().next();
			return key1.compareTo(key2);
		});
		String[] result = new String[strings.length];
		for(int i=0; i<result.length; ++i) {
			//result[i] = keyList.get(i)
		}
		return keyList.toArray(new String[keyList.size()]);
	}
	public static void main(String[] args) {
		Arrays.stream(solution(new String[] {"abce", "cdx", "abcd"}, 2)).forEach(System.out::println);
	}

}
