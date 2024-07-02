package com.javaex.ex01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
//		5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요.

		Scanner sc = new Scanner(System.in);

		int[] a = new int[5];
		int sum = 0;
		int result = 0;

		for (int i = 0; i <a.length; i++) {
		    sum = sc.nextInt();
			a[i]=sum;
			
		}
		for(int b =0;b<a.length;b++) {
			result = a[b]+result;
		}
		System.out.println("평균은 " + ((double)result/ 5));
		sc.close();

	}

}
