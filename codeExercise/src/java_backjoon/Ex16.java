// 백준-23971-ZOAC 4
package java_backjoon;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int H = sc.nextInt();
		int W = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < H; i+=(N+1)) {
			for (int j = 0; j < W; j+=(M+1)) {
				count++;
			}
		}
		System.out.println(count);

	}
}
