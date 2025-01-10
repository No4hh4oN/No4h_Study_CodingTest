package java_book;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex70 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("c");
		treeSet.add("f");
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		System.out.println("[c-f] 사이의 단어 검색");
		// c 부터 true? 포함 false? 불포함, f 까지 forever 은 안됨, true 이면 f 까지 나옴, false 면 f 는 안나옴
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for (String word : rangeSet) {
			System.out.println(word);
		}
	}
}