// 정올-연산자-형성평가1 #111
package java_jungol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] subject = new String[4];
		int total = 0;
		subject = br.readLine().split(" ");
		
		for(int i = 0; i< subject.length; i++) {
			total += Integer.parseInt(subject[i]);
		}
		System.out.println("sum " + total);
		System.out.println("avg " + total/4);
	}
}