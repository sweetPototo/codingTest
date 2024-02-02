package day22;

import java.util.Arrays;
import java.util.Collections;

public class Solution1 {
	 public long solution(long n) {
	        String num = String.valueOf(n);
			Integer str[] = new Integer [num.length()];
			for(int i=0; i<num.length(); ++i) {
				str[i] = Integer.valueOf(Character.getNumericValue(num.charAt(i)));
			}
			Arrays.sort(str, Collections.reverseOrder());
			String ans = "";
			for(int i=0; i<num.length(); ++i) {
				ans += String.valueOf(str[i]);
			}
	        return Long.valueOf(ans);
	    }
}
