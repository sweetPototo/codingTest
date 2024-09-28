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
		int len = number.length;
		
		for(int i=0; i<len; ++i) {  //2
			
			for(int j=i+1; j<len; ++j) {  //3
				for(int k=j+1; k<len; ++k) { //0
					int group[] = {number[i], number[j], number[k]};
					ArrayList<Integer> listCom = new ArrayList<>();
					for(int g : group) {   //삼충사 리스트에 넣기
						listCom.add(g);
					}
					int sum = 0;
					System.out.println(listCom.size());
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
			}
		}
        int answer = com.size();
        return answer;
    }
}
