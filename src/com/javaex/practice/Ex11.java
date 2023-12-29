package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");

		int num = sc.nextInt();
		int even = 0, odd = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		if (num % 2 == 0) {
			System.out.println("결과값 : " + odd);
		} else {
			System.out.println("결과값 : " + even);
		}

		sc.close();

	}

}
