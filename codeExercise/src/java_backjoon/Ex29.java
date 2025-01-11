package java_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex29 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());
		long result = 1;
		for (long i = 1; i <= N; i++) {
			result = result + 4 + (3 * (i - 1));
		}
		System.out.println(result % 45678);
	}
}
