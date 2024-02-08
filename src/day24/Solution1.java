package day24;

public class Solution1 {
//	두 정수 사이의 합 : 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 
//	예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
	
	public long solution(int a, int b) {
        long sum = 0;
		long big = (a>b)?a:(a==b)?a:b;
		long small = (big==a)?b:a;
		for(long i=small; i<=big; ++i) {
			sum += i;
		}
        return sum;
    }
}
