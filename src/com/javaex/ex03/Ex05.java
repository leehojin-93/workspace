package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		// 조건문 예제 - 2
		Scanner sc = new Scanner(System.in);

		System.out.println("철수의 편의점 아르바이트 일급 계산^^");
		System.out.print("철수의 근무시간: ");
		int time = sc.nextInt();
		int time_if = time * 10000;
		int time_else = time * 15000 - 40000;
		
		if (time <= 8) {
			System.out.println("오늘의 급여는 "+time_if+"원 입니다.");
		} else {
			System.out.println("오늘의 급여는 "+time_else+"원 입니다.");
		}

		sc.close();
	}

}
