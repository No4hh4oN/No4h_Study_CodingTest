// 정올-Beginner-도형만들기1-구구단 #1291
package java_jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex24 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int age = Integer.parseInt(br.readLine());

		if (age >= 20) {
			System.out.println("adult");
		} else {
			System.out.println(20 - age + " years later");

		}
	}
}