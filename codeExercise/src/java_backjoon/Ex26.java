// 백준-3029-경고
package java_backjoon;

import java.io.*;
import java.text.DecimalFormat;

public class Ex26 {
	public static void main(String[] args) throws IOException {
		DecimalFormat df = new DecimalFormat("00");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] timeStr1 = br.readLine().split(":");
		String[] timeStr2 = br.readLine().split(":");

		int[] time1 = new int[3];
		int[] time2 = new int[3];

		for (int i = 0; i < time1.length; i++) {
			time1[i] = Integer.parseInt(timeStr1[i]);
		}

		for (int i = 0; i < time1.length; i++) {
			time2[i] = Integer.parseInt(timeStr2[i]);
		}

		int S = time2[2] - time1[2];
		if (S < 0) {
			S = (time2[2] + 60) - time1[2];
			time2[1]--;
		}
		int M = time2[1] - time1[1];
		if (M < 0) {
			M = (time2[1] + 60) - time1[1];
			time2[0]--;
		}
		int H = time2[0] - time1[0];
		if (H < 0) {
			H = (time2[0] + 24) - time1[0];
		}
		
		if (H == 0 && M == 0 && S == 0) {
		    System.out.println("24:00:00");
		} else {
		    System.out.println(df.format(H) + ":" + df.format(M) + ":" + df.format(S));
		}
	}
}