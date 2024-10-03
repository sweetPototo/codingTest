package day48;

public class Solution {
	public static void main(String[] args) {
		int result = solution(new int[][] { {60, 50}, {30, 70}, {60, 30}, {80, 40}} );
		System.out.println("result : " + result);
	}
	public static int solution(int[][] sizes) {
		int result[] = new int[] {0,0};
		
		for(int[] bc : sizes) {
			//더 긴 길이를 w(가로) 길이로 더 짧은 길이를 h(세로) 길이로
			int maxNum = Math.max(bc[0], bc[1]);
			int minNum = Math.min(bc[0], bc[1]);
			bc[0] = maxNum;
			bc[1] = minNum;
			
			for (int i=0; i<bc.length; ++i) {
				if(bc[i]>result[i]) result[i] = bc[i];
			}
		}
        int answer = result[0] * result[1];
        return answer;
    }
}
