package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("상품가격: ");
		double a = sc.nextInt();
		System.out.print("받은돈: ");
		double b = sc.nextInt();
		System.out.println("=============================");
		System.out.println("받은돈: "+b+"" );
		System.out.println("상품가격: "+a+"" );
		double c = a*0.1;
		System.out.println("부가세: "+c+"" );
		double d = b-a;
		System.out.println("잔액: "+d+"" );
		
		sc.close();
		
	}
}
