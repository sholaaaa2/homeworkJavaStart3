package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ax = 0;
		double ay = 0;
		double bx = 4;
		double by = 4;
		double cx = 6;
		double cy = 1;
		double x;
		double y;

		System.out.println(Введите координату X );
		x = sc.nextDouble();
		System.out.println(Введите координату Y );
		y = sc.nextDouble();
		double a = ((ax - x)  (by - ay)) - ((bx - ax)  (ay - y));
		double b = ((bx - x)  (cy - by)) - ((cx - bx)  (by - y));
		double c = ((cx - x)  (ay - cy)) - ((ax - cx)  (cy - y));

		if ((a = 0 && b = 0 && c = 0)  (a = 0 && b = 0 && c = 0)) {
			System.out.println(Координата лежит в треугольнике);
		} else {
			System.out.println(Координата лежит вне треугольника);
		}
	}
}
