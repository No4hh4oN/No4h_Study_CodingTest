// 정올-선택제어문-자가진단2 #529
package java_jungol;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
		n1 += 100;
		n2 = n2 % 10;
		System.out.println(n1 + " " +  n2);
	}
}
