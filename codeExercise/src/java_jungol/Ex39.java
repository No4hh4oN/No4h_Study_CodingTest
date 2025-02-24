package java_jungol;

import java.util.Scanner;

public class Ex39 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double count = 0;
		int total = 0;

		for (;;) {
			int temp = scanner.nextInt();
			total += temp;
			count++;
			if (temp > 99) {
				scanner.close();
				break;
			}
		}

		System.out.println(total);
		double avg = total / count;
		System.out.printf("%.1f", avg);
	}
}
