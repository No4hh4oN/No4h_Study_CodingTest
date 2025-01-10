package java_book;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex69 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		//내림차순 정렬
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for (Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		
		//오름차순 정렬
		System.out.println();
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for (Integer score : ascendingSet) {
			System.out.print(score + " ");
		}
	}
}