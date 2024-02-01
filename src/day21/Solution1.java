package day21;

public class Solution1 {
//	자연수 뒤집어 배열로 만들기 : ​자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
//	예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
	
	public int[] solution(long n) {
        String str = String.valueOf(n);
        int answer[] = new int[str.length()];
        for(int i=0; i<str.length(); ++i) {
            answer[i] = Character.getNumericValue(str.charAt(str.length()-1-i));
        }
        return answer;
    }

}
