package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("환전할 원화를 입력하세요: ");
		int a = sc.nextInt();
		double b = a/1230.95;
		System.out.print("받으실 달러는: "+b+"");
		
		
		
		sc.close();
	}

}
