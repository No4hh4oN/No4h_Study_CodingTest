package java_backjoon;

import java.io.IOException;
import java.util.Scanner;

public class Ex52 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();
		int N = 1;

		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - (i + 1))) {
				N = 0;
			}
		}

		System.out.println(N);
	}
}
