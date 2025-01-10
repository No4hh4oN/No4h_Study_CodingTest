// 정올-Beginner-도형만들기1-구구단 #1291
package java_jungol;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p, q;
		p = sc.nextInt();
		q = sc.nextInt();
		int num = 1;
		
		for(int i = 0; i < p; i++) {
			for(int j = 0;  j < q; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}