package day54;

public class Solution {
	
	public static String solution(int[] food) {
		int count = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<food.length; ++i) {
        	if(food[i] == 1) {
        		continue;
        	}else {
        		int dish = food[i]/2;
        		for(int j=0; j<dish; ++j) {
        			sb.append(count);
        		}
        		count++;
        	}
        }
        return null;
    }

	public static void main(String[] args) {
		System.out.println("solution : " + solution(new int[] {1, 3, 4, 6}));

	}

}
