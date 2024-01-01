package com.javaex.practice;

import java.util.Scanner;

public class Ex05_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double[] dArray = new double[5];
		double sum = 0;
		
		for (int i = 0; i < dArray.length; i++) {
			dArray[i] = sc.nextDouble();
			sum = sum + dArray[i];
		}
		
		double avg = sum / 5;
		
		System.out.println(avg);
		sc.close();
		
	}

}
