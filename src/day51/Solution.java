package day51;

public class Solution {
	public static int changeNumber(String s) {
		//48~57
		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		StringBuilder result = new StringBuilder(); //반환할 결과 저장
		StringBuilder compare = new StringBuilder(); //number와 비교할 문자열 저장
		
		for(int i = 0; i<s.length(); ++i) {
			char alphabet = s.charAt(i); //숫자로 바꾸기
			if(alphabet >= 48 && alphabet <= 57) {  //숫자면 result에 append
				result.append(s.charAt(i));
				continue;
			}else {  //문자면?
				compare.append(s.charAt(i));
				for(int j=0; j<number.length; ++j) {
					if(number[j].equals(compare.toString())) {  //compare과 number의 요소가 같다면?
						result.append(j);		//result에 추가
						compare.setLength(0);   //compare 초기화
						break;
					}else {
						continue;  //아니라면 계속 진행
					}
				}
			}
		}
		return Integer.parseInt(result.toString());
	}
	
	public static int solution(String s) {
		try {
			int result = Integer.parseInt(s);
			return result;
		}catch (NumberFormatException e) {
			return changeNumber(s);
		}
	}

	public static void main(String[] args) {
		System.out.println(solution("one4seveneight"));

	}

}
