package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число XXXXXX");
		int x = sc.nextInt();
		int num1 = x / 100000;
		int num2 = x % 100000 / 10000;
		int num3 = x % 10000 / 1000;
		int num4 = x % 1000 / 100;
		int num5 = x % 100 / 10;
		int num6 = x % 10;

		if (num1 == num6 && num2 == num5 && num3 == num4) {
			System.out.println("Polindrome");
		} else {
			System.out.println("Not Polindrome");
		}

	}
}
