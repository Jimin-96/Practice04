//package com.javaex.ex01;
//
//import java.util.Scanner;
//
//public class Ex09 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("금액:");
//		int sum = sc.nextInt();
//		sc.close();
////
//		int[] won = new int[10];
//		int[] won1;
//		won1 =won;
//		
//		won[0] = 50000;
//		won[1] = 10000;
//		won[2] = 5000;
//		won[3] = 1000;
//		won[4] = 500;
//		won[5] = 100;
//		won[6] = 50;
//		won[7] = 10;
//		won[8] = 5;
//		won[9] = 1;
//		
//
//		int coin0 = 0; 
//		
//		while(true) {
//			if(won[0]<=sum) {
//				coin0 = sum/won[0];
//				sum = sum%won[0];
//				if(won[1]<sum) {
//					coin1 = sum/won[1];
//					sum = sum%won[1];
//					if(won[2]<sum) {
//						coin2 = sum/won[2];
//						sum = sum%won[2];
//						if(won[3]<sum) {
//							coin3 = sum/won[3];
//							sum = sum%won[3];
//							if(won[4]<sum) {
//								coin4 = sum/won[4];
//								sum = sum%won[4];
//								if(won[5]<sum) {
//									coin5 = sum/won[5];
//									sum = sum%won[5];
//									if(won[6]<sum) {
//										coin6 = sum/won[6];
//										sum = sum%won[6];
//										if(won[7]<sum) {
//											coin7 = sum/won[7];
//											sum = sum%won[7];
//											if(won[8]<sum) {
//												coin8 = sum/won[8];
//												sum = sum%won[8];
//												if(won[9]<sum) {
//													coin9 = sum/won[9];
//													sum = sum%won[9];
//												}
//											}
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}else 	if(won[1]<=sum) {
//				if(won[1]<sum) {
//					coin1 = sum/won[1];
//					sum = sum%won[1];
//					if(won[2]<sum) {
//						coin2 = sum/won[2];
//						sum = sum%won[2];
//						if(won[3]<sum) {
//							coin3 = sum/won[3];
//							sum = sum%won[3];
//							if(won[4]<sum) {
//								coin4 = sum/won[4];
//								sum = sum%won[4];
//								if(won[5]<sum) {
//									coin5 = sum/won[5];
//									sum = sum%won[5];
//									if(won[6]<sum) {
//										coin6 = sum/won[6];
//										sum = sum%won[6];
//										if(won[7]<sum) {
//											coin7 = sum/won[7];
//											sum = sum%won[7];
//											if(won[8]<sum) {
//												coin8 = sum/won[8];
//												sum = sum%won[8];
//												if(won[9]<sum) {
//													coin9 = sum/won[9];
//													sum = sum%won[9];
//												}
//											}
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}else 	if(won[2]<=sum) {
//				if(won[2]<sum) {
//					coin2 = sum/won[2];
//					sum = sum%won[2];
//					if(won[3]<sum) {
//						coin3 = sum/won[3];
//						sum = sum%won[3];
//						if(won[4]<sum) {
//							coin4 = sum/won[4];
//							sum = sum%won[4];
//							if(won[5]<sum) {
//								coin5 = sum/won[5];
//								sum = sum%won[5];
//								if(won[6]<sum) {
//									coin6 = sum/won[6];
//									sum = sum%won[6];
//									if(won[7]<sum) {
//										coin7 = sum/won[7];
//										sum = sum%won[7];
//										if(won[8]<sum) {
//											coin8 = sum/won[8];
//											sum = sum%won[8];
//											if(won[9]<sum) {
//												coin9 = sum/won[9];
//												sum = sum%won[9];
//											}
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//					}else 
//						if(sum==0) {
//							System.out.println("50000원"+coin0+"개");
//							System.out.println("10000원"+coin1+"개");
//							System.out.println("5000원"+coin2+"개");
//							System.out.println("1000원"+coin3+"개");
//							System.out.println("500원"+coin4+"개");
//							System.out.println("100원"+coin5+"개");
//							System.out.println("50원"+coin6+"개");
//							System.out.println("10원"+coin7+"개");
//							System.out.println("5원"+coin8+"개");
//							System.out.println("1원"+coin9+"개");	
//							break;
//						}
//
//	}
//
//}
//}
