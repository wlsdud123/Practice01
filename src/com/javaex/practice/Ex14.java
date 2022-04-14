package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("가로를 입력하세요: ");
		double a = sc.nextInt();
		System.out.print("세로를 입력하세요: ");
		double b = sc.nextInt();
		double ab = a*b;
		double abc = (a+b)*2;	
		System.out.println("사각형의 넓이는 :"+ab+" ");
		System.out.print("사각형의 둘레는 :"+abc+" ");
	
		
		
		sc.close();
		
	}
}
