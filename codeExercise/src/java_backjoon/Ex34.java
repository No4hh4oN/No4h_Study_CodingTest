package java_backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex34 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		TreeSet<String> word = new TreeSet<String>();
		for (int i = 0; i < N; i++) {
			word.add(br.readLine());
		}
		
		
//		NavigableSet<String> nWord = word.descendingSet();
//		NavigableSet<String> nWords = nWord.descendingSet();
//		for (String str : nWords) {
//			System.out.println(str);
//		}
	}
}