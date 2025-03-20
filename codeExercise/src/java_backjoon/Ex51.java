package java_backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex51 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] N = br.readLine().split(" ");
		int N1 = Integer.parseInt(N[0]);

		String[] arr1 = br.readLine().split(" ");

		ArrayList<Integer> set = new ArrayList<Integer>();

		Integer[] resultArray = set.toArray(new Integer[0]);

		Arrays.sort(resultArray);
		for (int num : resultArray) {
			bw.write(num + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
