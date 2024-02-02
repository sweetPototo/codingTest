package day23;

public class Solution1 {
	public boolean solution(int x) {
		String[] num = String.valueOf(x).split("");
		int sum = 0;
		for(String s : num) {
			sum += Integer.valueOf(s);
		}
		return x%sum == 0;
	}
}
