package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {

		/*
		  주어진 문자열의 공백을 ‘,’(콤마) 로 변경 후 출력하세요.
		 */
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		System.out.println(c);
		c[4]=',';
		c[7]=',';
		c[9]=',';
		c[9]=',';
		System.out.println(c);
		
	}

}
