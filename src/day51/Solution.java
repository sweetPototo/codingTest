package day51;

public class Solution {
	public static int changeNumber(String s) {
		//48~57
		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		StringBuilder result = new StringBuilder();
		StringBuilder numberString = new StringBuilder();
		for(int i = 0; i<s.length(); ++i) {
			char alphabet = s.charAt(i);
			if(alphabet >= 48 || alphabet <= 57) {
				result.append(s.charAt(i));
			}else {
				
			}
		}
	}
	
	public static int solution(String s) {
		try {
			int result = Integer.parseInt(s);
			return result;
		}catch (NumberFormatException e) {
			return changeNumber(s);
		}
	}

	public static void main(String[] args) {
		System.out.println("one4seveneight");

	}

}
