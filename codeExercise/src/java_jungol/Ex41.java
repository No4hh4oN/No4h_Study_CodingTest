package java_jungol;

import java.util.Scanner;

public class Ex41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		double d3 = sc.nextDouble();
		
		System.out.println((int)d1);
		d1-=(int)d1;
		System.out.printf("%.0f", d1*100);
		System.out.println((int)d2);
		d2-=(int)d2;
		System.out.printf("%.0f", d2*100);
		System.out.println((int)d3);
		d3-=(int)d3;
		System.out.printf("%.0f", d3*100);
	}
}
