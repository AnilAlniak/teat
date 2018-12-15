package com.bilgeadam.conditions;

public class SwitchIfexample {

	public static void main(String[] args) {

		int a = 44;

		switch (a) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			break;
		default:
			System.out.println("not found");
			break;
		}

		if (a == 1) {
			System.out.println("1");
		} else if (a == 2) {
			System.out.println("2");
		} else if (a == 3) {
			System.out.println("3");
		} else if (a == 4) {
			System.out.println("4");
		} else if (a == 5) {
			System.out.println("5");
		} else {
			System.out.println("Not found");

		}

	}

}
