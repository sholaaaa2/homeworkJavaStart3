package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 num");
		int max = sc.nextInt();
		System.out.println("enter 2 num");
		int a = sc.nextInt();
		System.out.println("enter 3 num");
		int b = sc.nextInt();
		System.out.println("enter 4 num");
		int c = sc.nextInt();
		
		max = (max<a)?a:max;
		max = (max<b)?b:max;
		max = (max<c)?c:max;
		
		System.out.println("Max = "+max);
	}
}
