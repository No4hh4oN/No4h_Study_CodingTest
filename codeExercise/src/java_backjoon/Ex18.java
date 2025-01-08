// 백준-15727
package java_backjoon;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = N / 5;
		if (N % 5 > 0 && N % 5 < 5) {
			result++;
		}
		System.out.println(result);
		sc.close();
	}
}
