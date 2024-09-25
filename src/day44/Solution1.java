package day44;

public class Solution1 {
//	숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 
//	이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
	class Solution {
	    public int solution(String t, String p) {
	        int pLen = p.length();
			int answer = 0;
			for(int i=0; i<=t.length()-pLen; ++i) {
				StringBuilder sb = new StringBuilder();
				for(int j=i; j<i+pLen; ++j) { 
					if(j>=t.length()) break;
					sb.append(t.charAt(j));
				}
				if(Long.parseLong(p) >= Long.parseLong(sb.toString())) {
					++answer;
				}
			}
			return answer;
	    }
	}
}