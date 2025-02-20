package java_jungol;

import java.util.Scanner;
import java.util.TreeMap;

public class Ex38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        while (true) {
            int num = scanner.nextInt();
            
            if(num == 0) {
            	break;
            }
            
            if (num < 1 || num > 100) {
                break;
            }

            map.put(num / 10, map.getOrDefault(num/10, 0) + 1);
        }
        
        scanner.close();

        for (int key : map.keySet()) {
            System.out.println(key+ " : " + map.get(key));
        }
    }
}
