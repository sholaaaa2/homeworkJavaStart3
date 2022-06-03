package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число XXXX");
		int x = sc.nextInt();
		int num1 = x/1000;
		int num2 = x%1000/100;
		int num3 = x%100/10;
		int num4 = x%10;
		
		if ((num1+num2)== (num3+num4)) {
			System.out.println("Это счастливый билет :)");
		} else {
			System.out.println("Это не счастливый билет :(");
		}

	}
}
