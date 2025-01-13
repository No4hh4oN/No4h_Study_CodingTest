package java_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex33 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = 0;
		for(int i = 0; i < 5; i++) {
			int N = Integer.parseInt(br.readLine());
			if(N < 0 || N > 100) {
				i--;
				continue;
			}
			total += N;
			
		}
		System.out.println(total);
	}
}
