//백준-9498-시험성적
package java_backjoon;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		int sc = sc2.nextInt();
		sc2.close();

		//If 조건문을 이용한 계산
		if (sc <= 100 && sc >= 90) {
			System.out.println("A");
		} else if (sc >= 80) {
			System.out.println("B");
		} else if (sc >= 70) {
			System.out.println("C");
		} else if (sc >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
//		//Switch-Case를 이용한 계산
//		switch(sc/10) {
//		case 9: case 10:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default :
//			System.out.println("F");
//			break;
//		}
	}
}
