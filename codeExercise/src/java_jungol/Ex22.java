// 정올-Beginner-도형만들기1-구구단 #1291
package java_jungol;

import java.util.Scanner;

public class Ex22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s, e;
		
		while (true) {
			s = sc.nextInt();
			e = sc.nextInt();
			if ((s >= 2 && s <= 9) && (e >= 2 && e <= 9) ) {
				break;
			}
			else {
				System.out.println("INPUT ERROR!");
			}
		}
		sc.close();
		
		for(int i = 1; i < 10; i++) {
			if(s > e) {
				for(int j = s; j >= e; j--) {
					System.out.printf("%d * %d = %2d", j, i, j * i);
					if(j != e) {
						System.out.print("   ");
					}
				}
				System.out.println();
			}
			else {
				for(int j = s; j <= e; j++) {
					System.out.printf("%d * %d = %2d", j, i, j * i);
					if(j != e) {
						System.out.print("   ");
					}
				}
				System.out.println();
			}
			
			
		}

	}
}