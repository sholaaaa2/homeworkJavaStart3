package com.gmail.kukaruka52;

public class Main {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 4;

		if (a < (b + c) && c < (b + a) && b < (a + c)) {
			System.out.println("Triangle exist");
		} else {
			System.out.println("Triangle not exist");
		}
	}
}
