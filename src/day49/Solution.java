package day49;

public class Solution {
	public static char cal(char sp, int n) {
		if(sp >= 65 && sp <= 90) { //대문자 65~90
			sp += n;
			if(sp > 90) {
				sp = (char)(64 + (n - (90 - (sp - n))));
			}
		}else if(sp >= 97 && sp <= 122) {  //소문자 97 ~ 122
			sp += n;
			if (sp > 122) {
				sp = (char)(96 + (n - (122 - (sp - n))));
			}
		}
       return sp;
	}

	public static String solution(String s, int n) {
		char[] sp = s.toCharArray();
		for(int i=0; i<sp.length; ++i) {
			if(sp[i] == ' ') {
				continue;
			}
			sp[i] = cal(sp[i], n);
		}
        String answer = String.valueOf(sp);
        return answer;
    }
	
	public static void main(String[] args) {
		String sl = solution("Z", 7);
		System.out.println(sl);  
		
	}

}
