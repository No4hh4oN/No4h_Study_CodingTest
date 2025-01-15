package java_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex35 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int SK = 0;
		int CY = 0;
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; ; i++) {
			if(N <= 0 && i / 2 == 0) {
				System.out.println("CY");
			}
			if(N <= 0 && i / 2 != 0) {
				System.out.println("SK");
			}
			//상근 차례
			if(i / 2 == 0) {
				// 1 뺐는데 3 이상 남은 경우
				if(N - 1 > 3 && N - 3 > 3) {
					N -= 3;
				}
				else if(N - 1 > 3 && N -3 <= 3) {
					N -= 1;
				}
				else {
					N -= 3;
				}
			}
			
			//창영 차례
			else if(i / 2 != 0) {
				if(N - 3 < 4) {
					
				}
			}
		}
	}
}