package day21;

public class Solution2 {
//	정수 제곱근 판별 : ​임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	
	public long solution(long n) {
        double num = Math.sqrt(n);
        double result = num - (int)num;
        if(result == 0) {
            long answer = (long)((num+1)*(num+1));
            return answer;
        }else {
            return -1;
        }
    }

}
