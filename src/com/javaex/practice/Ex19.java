package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num, money, minus;
		int deposit = 0;

		do {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");

			System.out.print("선택 > ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("예금액 > ");
				money = sc.nextInt();
				deposit += money;
				System.out.println();
				break;
			case 2:
				System.out.print("출금액 > ");
				minus = sc.nextInt();
				deposit -= minus;
				System.out.println();
				break;
			case 3:
				System.out.print("잔고액 > ");
				System.out.println(deposit);
				System.out.println();
				break;
			case 4:
				break;

			default:
				System.out.println("다시입력해주세요");
				System.out.println();
				break;
			}

		} while (num != 4);
		System.out.println("프로그램종료");
	}

}
