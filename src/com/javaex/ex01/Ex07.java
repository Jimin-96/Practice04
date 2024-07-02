package com.javaex.ex01;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//	키보드에서 정수로 된 돈의 액수를 입력받아 50000원권, 10000원권, 5000원권, 1000원권, 500원
		//	동전, 100원동전, 50원동전, 1원동전 각 몇 개로 변환 되는지 작성 하세요. (아래의 배열을 사용하여 코딩하세요.)
		//

        Scanner sc = new Scanner(System.in);
		
		int[] coin = new int[10] ;
		coin[0] = 50000; 
		coin[1] = 10000; 
		coin[2] = 5000; 
		coin[3] = 1000; 
		coin[4] = 500; 
		coin[5] = 100; 
		coin[6] = 50; 
		coin[7] = 10; 
		coin[8] = 5; 
		coin[9] = 1; 
		System.out.print("금액: ");
		int won = sc.nextInt();
		int count = 0 ;
		
		for (int i = 0 ; i < coin.length; i++) {
			count = won/coin[i];
			won = won -  (coin[i] *count) ; 
			System.out.println(coin[i]+"원: " + count+"개");
		}
		sc.close();
				
			}
		

}


