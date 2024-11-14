package day53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution2 {
	public static String[] solution(String[] strings, int n) {
		List<String> stringList = new ArrayList<>();
		for(String s : strings) {
			stringList.add(s);
		}
		//람다로 구현
		stringList.sort((o1, o2) -> {
			if(o1.charAt(n) > o2.charAt(n)) { //n의 아스키 코드값이 더 크면
				return 1;
			}else if(o1.charAt(n) == o2.charAt(n)) {  //n의 아스키 코드값이 같으면 여기서 그냥 일반 compareTo()를 불러와도 괜찮음
				int lenght = Math.min(o1.length(), o2.length());
				for(int i=0; i<lenght; ++i) {
					if(o1.charAt(i) > o2.charAt(i)) {
						return 1;
					}else if(o1.charAt(i) == o2.charAt(i)) {
						continue;
					}else {
						return -1;
					}
				}
			}else {  //n의 아스키값이 더 작으면
				return -1;
			}
			
			return 0; //두 문자열이 완벽하게 일치
		});
		
		//익명클래스로 구현
//		stringList.sort(new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				if(o1.charAt(n) > o2.charAt(n)) { //n의 아스키 코드값이 더 크면
//					return 1;
//				}else if(o1.charAt(n) == o2.charAt(n)) {  //n의 아스키 코드값이 같으면
//					int lenght = Math.min(o1.length(), o2.length());
//					for(int i=0; i<lenght; ++i) {
//						if(o1.charAt(i) > o2.charAt(i)) {
//							return 1;
//						}else if(o1.charAt(i) == o2.charAt(i)) {
//							continue;
//						}else {
//							return -1;
//						}
//					}
//				}else {  //n의 아스키값이 더 작으면
//					return -1;
//				}
//				
//				return 0; //두 문자열이 완벽하게 일치
//			}
//		});
		return stringList.toArray(new String[stringList.size()]);
	}
	public static void main(String[] args) {
		Arrays.stream(solution(new String[] {"abce", "cdx", "abcd"}, 2)).forEach(System.out::println);
	}

}
