package day43;

public class Solution1 {
//	문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
//	각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
//	각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
	
	public String solution(String s) {
        StringBuilder sb = new StringBuilder();
		int turn = s.length();
		
		//문장 분해
		char[] str = new char[turn];
		for(int i=0; i<turn; ++i) {
			str[i] = s.charAt(i);
		}
		
		int num = 0; //단어별 짝, 홀수
		for(char sNum : str) {
			if(Character.toString(sNum).equals(" ")) {
				num = 0;
				sb.append((char)sNum);
				continue;
			}
			if(num%2==0) { //짝수
				if(sNum>96 && sNum<123) { //소문자라면
					sNum -= 32;
				}
			}else { //홀수
				if(sNum>64 && sNum<91) { //대문자라면
					sNum += 32;
				}
			}
			++num;
			sb.append((char)sNum);
		}
		return sb.toString();
    }
}
