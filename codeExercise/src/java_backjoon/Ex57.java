package java_backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex57 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();

		String[] split1 = str.split("-");

		int result = 0;

		for (int i = 0; i < split1.length; i++) {
			String newStr = split1[i];
			
			String[] split2 = newStr.split("\\+");

			int sum = 0;
			
			for(int j = 0; j < split2.length; j++) {
				sum+= Integer.parseInt(split2[j]);
			}

			if (i == 0) {
				result += sum;
			} else {
				result -= sum;
			}
		}

		bw.write(String.valueOf(result));
		
		bw.flush();
		bw.close();
		br.close();
	}
}
