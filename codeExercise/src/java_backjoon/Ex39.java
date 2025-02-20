package java_backjoon;

import java.util.Scanner;
import java.util.TreeMap;

public class Ex39 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String wordString = new String();
    	wordString = scanner.next().toUpperCase();
    	scanner.close();
    	
        TreeMap<Character, Integer> map = new TreeMap<>();
        
        for(int i = 0; i < wordString.length(); i++) {
        	map.put(wordString.charAt(i), map.getOrDefault(wordString.charAt(i), 0) + 1);
        }
        
        int max = -1;
        char maxChar = '?';
        boolean isDuplicate = false;

        for (Character key : map.keySet()) {
            int count = map.get(key);
            if (count > max) {
                max = count;
                maxChar = key;
                isDuplicate = false;
            } else if (count == max) {
                isDuplicate = true;
            }
        }

        System.out.println(isDuplicate ? "?" : maxChar);
    }
}
