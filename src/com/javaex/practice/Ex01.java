package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {

		/*
		 Ex01 아래의 코드를 실행하면 출력결과에 오류가 발생한다. 오류 수정 후 출력결과를 예상하고 코드로 확인해 보세요.
		 i가 intArray랑 같으면 안된다.->범위 수정
		 
		 
		 예상 결과값: 22
		 */
		
		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result=0;
		for (int i = 0; i < intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
		
	}

}
