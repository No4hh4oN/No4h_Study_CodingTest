// 백준-2292-벌집
package java_backjoon;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num1 = 2;
		int num2 = 7;
		sc.close();
		if (N == 1) {
			System.out.println("1");
		}
		
		else {
			for (int i = 1;; i++) {
				if (num1 <= N && N <= num2) {
					System.out.println(i+1);
					break;
				}
				else {
					num1 += 6 * i;
					num2 += 6 * (i+1);
				}
			}
		}
	}
}