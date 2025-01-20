package java_jungol;

import java.util.Scanner;

public class Ex29 {
	public static void main(String[] args) {
		double[] score = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		System.out.println(score[n1-1] + score[n2-1]);
	}
}