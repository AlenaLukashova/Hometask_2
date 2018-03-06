package by.tc.jb24.task2;

import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {
		double a = 0;
		double b = 0;
		double c = 0;
		double x;

		Scanner sc = new Scanner(System.in);

		System.out.print("Введите a: ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}

		System.out.print("Введите b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}

		System.out.print("Введите c: ");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
		}

		double temp;
		temp = 2 * a;
		if (temp != 0) {
			x = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c
					+ b;
			System.out.print("Ответ: " + x);
		} else {
			System.out.print("Знаменатель равен нулю. Решение невозможно.");
			x = Double.NaN;
		}

	}

}
