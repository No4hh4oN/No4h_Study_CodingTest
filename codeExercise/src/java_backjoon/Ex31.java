package java_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex31 {
	public static void main(String[] args) throws IOException {
		String[] arr = { 
				"000000", // A
				"001111", // B
				"010011", // C
				"011100", // D
				"100110", // E
				"101001", // F
				"110101", // G
				"111010" // H
		};

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] inputArr = new String[N];
		String inputStr = br.readLine();

		int index = 0;
		for (int i = 0; i < N; i++) {
			inputArr[i] = "";
			for (; index < N * 6; index++) {
				if (index == 6 * (i + 1)) {
					break;
				}
				inputArr[i] += inputStr.charAt(index);
			}
		}
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < N; i++) {
		    boolean found = false;
		    for (int j = 0; j < 8; j++) {
		        int diff = 0;
		        for (int k = 0; k < 6; k++) {
		            if (inputArr[i].charAt(k) != arr[j].charAt(k)) {
		                diff++;
		            }
		        }
		        if (diff <= 1) { // 한 자리만 다를 수 있음
		            result.append((char) ('A' + j));
		            found = true;
		            break;
		        }
		    }
		    if (!found) {
		        System.out.println(i + 1);
		        return;
		    }
		}
		System.out.println(result);
	}
}
