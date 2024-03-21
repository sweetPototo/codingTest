package day41;

public class Solution1 {
//	3진법 뒤집기 : 자연수 n이 매개변수로 주어집니다. 
//	n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
			
	public int solution(int n) {
        String base = Integer.toString(n, 3);
		String str = "";
		for(int i=base.length()-1; i>=0; --i) {
			str += base.charAt(i);
		}
		return Integer.parseInt(str, 3);
    }
}
