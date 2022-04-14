package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("500원 개수: ");
		int a = 500;
		int aa = sc.nextInt();
		System.out.print("100원 개수: ");
		int b = 100;
		int bb = sc.nextInt();
		System.out.print("50원 개수: ");
		int c = 50;
		int cc = sc.nextInt();
		System.out.print("10원 개수: ");
		int d = 10;
		int dd = sc.nextInt();
		int last = (a*aa)+(b*bb)+(c*cc)+(d*dd);
		
		System.out.println("동전의 총합은 "+last+" 원 입니다. ");
		
		
		
		
		sc.close();
	}
}
