package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		/*
		 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요
		 */
		Scanner sc = new Scanner(System.in);
		
		double[] dArray = new double[5];
		
		dArray[0] = sc.nextDouble();
		dArray[1] = sc.nextDouble();
		dArray[2] = sc.nextDouble();
		dArray[3] = sc.nextDouble();
		dArray[4] = sc.nextDouble();
		
		double avg = (dArray[0] + dArray[1] + dArray[2] + dArray[3] + dArray[4]) /5;
		System.out.println(avg);
		
		sc.close();
	}

}
