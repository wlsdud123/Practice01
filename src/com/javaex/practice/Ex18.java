package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨: ");
		double b = sc.nextInt();
		double a = 5.0/9.0*(80.0-32.0);
		System.out.println("화씨 "+b+" 의 섭씨온도는 "+a+" 입니다.");
		
		sc.close();
	}
}
