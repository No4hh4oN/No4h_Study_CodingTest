package java_jungol;

import java.util.Scanner;
import java.util.TreeMap;

public class Ex36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Character, Integer> map = new TreeMap<>();
        
        while (true) {
            char ch = scanner.next().charAt(0);
            
            if (ch < 'A' || ch > 'Z') {
                break;
            }

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        scanner.close();

        for (char key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
