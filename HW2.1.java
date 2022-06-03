package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		int radius = 4;
		double dist;
		System.out.println("Введите координату X ");
		a = sc.nextDouble();
		System.out.println("Введите координату Y ");
		b = sc.nextDouble();
		dist = (a * a + b * b);
		if (dist <= radius * radius) {
			System.out.println("Координата лежит в кругу");
		} else {
			System.out.println("Координата лежит вне круга");
		}
	}
}
