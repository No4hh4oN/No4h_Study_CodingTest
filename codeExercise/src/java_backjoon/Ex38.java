package java_backjoon;

import java.io.*;
import java.util.*;

public class Ex38 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int n = 0;
        for(int arrs : arr) {
        	map.put(n++, arrs);
        }
        
        for (Integer i : map.keySet()) {
            System.out.println(map.get(i));
        }
    }
}
