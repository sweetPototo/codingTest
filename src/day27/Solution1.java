package day27;

import java.util.Arrays;

public class Solution1 {
//	없는 숫자 더하기 : 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
//	numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
			
	public int solution(int[] numbers) {
        int sum = 0;
		int co = 0; //0~9
		int num = 0; //numbers's index
		Arrays.sort(numbers);
		while(co<=9) {
			if(num>=numbers.length||co!=numbers[num]) {
				sum += co;
				++co;
			}else if(co==numbers[num]) {
				++co;
				++num;
			}	
		}
        return sum;
    }
}
