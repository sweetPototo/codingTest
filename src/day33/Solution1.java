package day33;

public class Solution1 {
//	약수의 개수와 덧셈 : 두 정수 left와 right가 매개변수로 주어집니다. 
//	left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
//	약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
			
	public int solution(int left, int right) {
        int sum = 0;
		for(int i = left; i<=right; ++i) {
			int div = 0;
			for(int j=1; j<=i; ++j) {
				if(i%j==0) ++div;
			}
			if(div%2==0) sum += i;
			else sum -= i;
		}
        return sum;
    }
}
