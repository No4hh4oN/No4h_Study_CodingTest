package java_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex30 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int R1 = Integer.parseInt(str[0]);
		int S = Integer.parseInt(str[1]);
		
		System.out.println(S * 2 - R1);
	}
}
