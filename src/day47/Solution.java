package day47;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) {
		int[] number = new int[] {-1, -1, 2, 2, 0, 0};
		int result = solution(number);
		System.out.println("result : " + result);
	}
	
	public static int solution(int[] number) {
		HashSet<ArrayList<Integer>> com = new HashSet<>();
		int len = number.length;
		
		for(int i=0; i<len; ++i) {  //2
			for(int j=i+1; j<len; ++j) {  //3
				for(int k=j+1; k<len; ++k) { //0
					ArrayList<Integer> listCom = new ArrayList<>();
					int sum = number[i] + number[j]+ number[k];
					System.out.printf("num : %d, %d, %d\n", number[i], number[j], number[k]);
					if(sum == 0) {
						System.out.println("sum : " + sum);
						int group[] = {number[i], number[j], number[k]};
						for(int g : group) {   //삼충사 리스트에 넣기
							listCom.add(g);
						}
						System.out.println("add data : " + listCom.toString());
						System.out.println();
						Collections.sort(listCom);
						com.add(listCom);
					}
				}
			}
		}
		System.out.println("result : " + com.toString());
        int answer = com.size();
        return answer;
    }
}
