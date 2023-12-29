package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");

		System.out.print("숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("숫자 : ");
		int num2 = sc.nextInt();

		System.out.print("숫자 : ");
		int num3 = sc.nextInt();

		System.out.print("숫자 : ");
		int num4 = sc.nextInt();

		System.out.print("숫자 : ");
		int num5 = sc.nextInt();

		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println("최대값은 " + num1 + "입니다.");
		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("최대값은 " + num2 + "입니다.");
		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println("최대값은 " + num3 + "입니다.");
		} else if (num4 > num5 && num4 > num1 && num4 > num2 && num4 > num3) {
			System.out.println("최대값은 " + num4 + "입니다.");
		} else {
			System.out.println("최대값은 " + num5 + "입니다.");
		}

	}

}
