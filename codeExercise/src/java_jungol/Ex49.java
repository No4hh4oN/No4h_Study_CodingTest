package java_jungol;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex49 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String input = scanner.nextLine();

			if (input.equals("END")) {
				break;
			}

			Map<String, Integer> wordCountMap = new LinkedHashMap<>();
			String[] words = input.split("\\s+");

			for (String word : words) {
				wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
			}

			List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCountMap.entrySet());
			sortedList.sort(Map.Entry.comparingByKey());

			// 출력
			for (Map.Entry<String, Integer> entry : sortedList) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}

		scanner.close();
	}
}
