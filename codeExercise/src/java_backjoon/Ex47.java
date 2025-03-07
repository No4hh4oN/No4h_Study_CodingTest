package java_backjoon;

import java.util.*;

public class Ex47 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String N = sc.next();
		int B = sc.nextInt();
		int num, result = 0;
		sc.close();
		
		for (int i = 0; i < N.length(); i++) {
			if (N.charAt(i) >= '0' && N.charAt(i) <= '9') {
				num = N.charAt(i) - '0';
			} else {
				num = N.charAt(i) - 'A' + 10;
			}
			result = result * B + num;
		}

		System.out.println(result);
	}
}
