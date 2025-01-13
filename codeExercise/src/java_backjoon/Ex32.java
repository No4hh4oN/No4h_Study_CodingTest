package java_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex32 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = new String[N];

		for (int i = 0; i < N; i++) {
			int count = 0;
			str[i] = br.readLine();
			for (int j = 0; j < str[i].length(); j++) {
				if(count < 0) {
					break;
				}
				else if (str[i].charAt(j) == '(') {
					count++;
				} else if (str[i].charAt(j) == ')') {
					count--;
				}
			}
			if(count == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
