// 정올-선택제어문-자가진단2 #529
package java_jungol;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BMI(sc.nextInt(), sc.nextInt());
		sc.close();
	}
	
	static void BMI(int n1, int n2) {
		System.out.println(n2 + 100 - n1);
		if (n2 + 100 - n1 > 0) {
			System.out.println("Obesity");
		}
	}
}
