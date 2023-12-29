package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("================================");
		System.out.println("\t[숫자맞추기게임 시작]");
		System.out.println("================================");

		int num = (int) (Math.random() * 100) + 1;
		System.out.println(num);

		int result = 0;

		while (true) {

			System.out.print(">> ");
			result = sc.nextInt();

			if (num > result) {
				System.out.println("더높게");
			} else if (num < result) {
				System.out.println("더낮게");
			} else {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n)");
				String ans = sc.nextLine();
				if (ans.equals("y")) {
					System.out.println("================================");
					System.out.println("\t[숫자맞추기게임 종료]");
					System.out.println("================================");
				}
			}

		}
	}
}
