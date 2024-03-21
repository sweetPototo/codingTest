package day42;

import java.util.Arrays;

public class Solution1 {
//	예산 : 부서별로 신청한 금액이 들어있는 배열 d와 예산 budget이 매개변수로 주어질 때, 
//	최대 몇 개의 부서에 물품을 지원할 수 있는지 return 하도록 solution 함수를 완성해주세요.
			
	public static void main(String args[]) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		Arrays.sort(d);
		int sum = 0;
		int count = 0;
		for(int money : d) {
			sum += money;
			if(sum>budget) {
				sum -= budget;
				break;
			}
			count += 1;
		}
		System.out.println(count);
	}
}
