package day31;

public class Solution1 {
//	가운데 글자 가져오기 : 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
//	단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	
	public static void main(String[] args) {
		String s = "abcdef";
		String answer = "";
		if(s.length()%2==1) {
			answer += s.charAt(s.length()/2);
			System.out.println("answer : " + answer);
		}else {
			for(int i=0; i<2; ++i) {
				answer += s.charAt(s.length()/2+i-1);
			}
		}
		System.out.println(answer);
	}
}
