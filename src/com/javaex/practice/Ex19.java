package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long a = 60*60*24*365*300000L;
		System.out.println("빛이 1년 동안 가는 거리는 "+a+" km 입니다.");
		
		sc.close();
	}
}
