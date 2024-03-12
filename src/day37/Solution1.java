package day37;

public class Solution1 {
	//행렬의 덧셈 : 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 
	//2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
	
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] result = arr1.clone();
		
		for(int i=0; i<arr1.length; ++i) {
			int [] num1 = arr1[i];
			int [] num2 = arr2[i];
			for(int j=0; j<num1.length; ++j) {
				result[i][j] = num1[j] + num2[j];
			}
		}
        
        return result;
    }
}
