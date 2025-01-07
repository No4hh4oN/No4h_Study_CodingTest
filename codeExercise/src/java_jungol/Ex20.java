//정올-문자열1-자가진단7 #599
package java_jungol;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String newStr = new String();
		String str = sc.next();
		sc.close();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				newStr += str.charAt(i);
			}
		}

		System.out.print(newStr.toUpperCase());
	}
}
