package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter year");
		int year = sc.nextInt();

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("This is leap year");
		} else {
			System.out.println("This is not leap year");
		}

	}
}
