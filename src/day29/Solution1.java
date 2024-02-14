package day29;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
//	제일 작은 수 제거하기 : 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
//	단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
//	예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
	
	public int[] solution(int[] arr) {
        int addNum = arr[0];
        List<Integer> list = new ArrayList<Integer>();
        for(Integer e : arr) {
            if(arr.length == 1) {  //인수가 1개인 경우
                list.add(-1);
                return list.stream().mapToInt(i->i).toArray();
            }else {
                if(addNum > e) {   //더 작은 숫자 찾기
                    addNum = e;    //더 작은 수는 따로 저장
                }
                list.add(e);
            }
        } //for
        list.remove(list.indexOf(addNum));
        return list.stream().mapToInt(i->i).toArray();
	}
}
