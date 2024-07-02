package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		//		배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또.

		int[] lotto = new int[6];

		for(int i=0;i<lotto.length;i++) {
			boolean sum;
			int num;
			do {
				sum = true;
				num = (int)(Math.random()*45)+1;
				for(int j =0;j<i;j++) {
					if(lotto[j]==num) {
						sum = false;
						break;
					}
				}
			}while(!sum);
		
			lotto[i]=num;
		}
		for(int j=0;j<lotto.length;j++) {
			System.out.print(lotto[j]+" \t");
		}
	}
}