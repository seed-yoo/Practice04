package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		/*
		 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또(중복체크 할 것)
		 */
		int[] ln = new int[6];
        boolean[] ns = new boolean[46]; 

        for (int i = 0; i < ln.length; i++) {
            int rn;
            do {
                rn = (int) (Math.random() * 45) + 1;
            } while (ns[rn]); 

            ln[i] = rn;
            ns[rn] = true;
            System.out.print(ln[i] + "\t");
            
        }
		
	}

}
