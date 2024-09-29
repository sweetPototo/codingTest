package day47;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Solution {
	public static void main(String[] args) {
		int[] number = new int[] {-1, -1, 2, 2, 0, 0};
		int result = solution(number);
		System.out.println("result : " + result);
	}
	
	public static int solution(int[] number) {
		int answer = 0;
		int len = number.length;
		
		for(int i=0; i<len-2; ++i) {  //2
			for(int j=i+1; j<len-1; ++j) {  //3
				for(int k=j+1; k<len; ++k) { //0
					int sum = number[i] + number[j]+ number[k];
					System.out.printf("num : %d, %d, %d\n", number[i], number[j], number[k]);
					if(sum == 0) {
						++answer;
					}
				}
			}
		}
        return answer;
    }
	
	//문제를 잘못 이해함... 같은 정수의 다른 학생이면 하나의 조합 경우라고 생각했었음...
//	public static int failSolution(int[] number) {
//		 HashSet<ArrayList<Integer>> com = new HashSet<>();
//			int len = number.length;
//			
//			for(int i=0; i<len; ++i) {
//				for(int j=i+1; j<len; ++j) {
//					for(int k=j+1; k<len; ++k) {
//						ArrayList<Integer> listCom = new ArrayList<>();
//						int sum = number[i] + number[j]+ number[k];
//						System.out.printf("num : %d, %d, %d\n", number[i], number[j], number[k]);
//						if(sum == 0) {
//							System.out.println("sum : " + sum);
//							int group[] = {number[i], number[j], number[k]};
//							for(int g : group) {
//								listCom.add(g);
//							}
//							System.out.println("add data : " + listCom.toString());
//							System.out.println();
//							Collections.sort(listCom);
//							com.add(listCom);
//						}
//					}
//				}
//			}
//			System.out.println("result : " + com.toString());
//	        int answer = com.size();
//	        return answer;
//    }
	
}
