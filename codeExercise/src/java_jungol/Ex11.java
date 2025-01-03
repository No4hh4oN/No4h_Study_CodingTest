// 정올-문자열1-자가진단1 #593
package java_jungol;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a;
		while(true) {
			System.out.print("ASCII code =? ");
			a = (char)sc.nextInt();
			if(a < 33 || a >127) {
				break;
			}
			System.out.println(a);
		}
		sc.close();
	}
}