package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {

		/*
		 double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문을 작성하세요.
		 */
		
		double[] dArray = new double[3];
		
		dArray[0] = 1.2;
		dArray[1] = 3.3;
		dArray[2] = 6.7;
		for (int i = 0; i < dArray.length; i++) {
			System.out.println(dArray[i]);
		}
	}

}
