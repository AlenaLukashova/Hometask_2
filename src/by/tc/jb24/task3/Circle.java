package by.tc.jb24.task3;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		double R;
		double square;
		double length;

		Scanner sc = new Scanner(System.in);

		System.out.print("������� R: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		R = sc.nextDouble();

		square = Math.PI * Math.pow(R, 2);
		length = 4 * Math.PI * R;

		System.out.println(String.format("������� �����: %.2f", square));
		System.out.println(String.format("����� ����������: %.2f", length));

	}

}
