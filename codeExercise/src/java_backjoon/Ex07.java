package java_backjoon;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int i = 1;
		int cnt = 1;
		
		while (x > cnt) {
			i++;
			cnt += i;
		}
		
		int num1 = cnt - i + 1;
		int count = x - num1;

		int p, q;
		if (i % 2 == 0) {
			p = 1 + count;
			q = i - count;
		} else {
			p = i - count;
			q = 1 + count;
		}
		System.out.println(p + "/" + q);
	}
}
