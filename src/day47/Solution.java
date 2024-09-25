package day47;

import java.util.HashSet;
import java.util.ArrayList;

public class Solution {
	public static void main(String[] args) {
		int[] number = new int[] {-2, 3, 0, 2, -5};
		int result = solution(number);
		System.out.println(result);
	}
	
	public static int solution(int[] number) {
		HashSet<ArrayList<Integer>> com = new HashSet<>();
		
		for(int i=0; i<number.length; ++i) {
			ArrayList<Integer> listCom = new ArrayList<>();
			for(int j=0; j<3; ++j) {
				try {
					listCom.add(number[i+j]);
				}catch(ArrayIndexOutOfBoundsException e) {
					if(i+j == 5) listCom.add(number[0]);
					else if(i+j == 6) listCom.add(number[1]);
				}
			}
			int sum = 0;
			for(Integer num : listCom) {
				System.out.println("num : " + num);
				sum += num;
			}
			System.out.println();
			if(sum == 0) {
				System.out.println("sum : " + sum);
				com.add(listCom);
			}
			
		}
        int answer = com.size();
        return answer;
    }
}
