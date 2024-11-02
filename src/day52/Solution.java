package day52;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public static int[] solution(String s) {
		
        StringBuilder compare = new StringBuilder(); //비교될 문자열
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<s.length(); ++i) {
        	int resultSize = result.size();
        	for(int j=compare.length()-1; j>=0; --j) { //비교될 문자열만큼 반복
        		if(compare.charAt(j) == s.charAt(i)) {
        			result.add(i-j);
        			break;
        		}
        	}
        	int afterLoopresultSize = result.size();
        	if(resultSize == afterLoopresultSize) {
        		result.add(-1);
        	}
        	compare.append(s.charAt(i));
        }
        return result.stream().mapToInt(Integer :: intValue).toArray();
    }

	public static void main(String[] args) {
		int[] result = solution("banana");
		for(int a : result) {
			System.out.printf("%d\t", a);
		}
	}
}
