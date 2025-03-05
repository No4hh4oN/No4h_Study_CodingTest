package java_backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Ex44 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> set = new HashSet<>();
        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String[] order = br.readLine().split(" ");
            
            switch (order[0]) {
                case "add": {
                    int addNum = Integer.parseInt(order[1]);
                    set.add(addNum);
                    break;
                }
                case "remove": {
                    int rmNum = Integer.parseInt(order[1]);
                    set.remove(rmNum);
                    break;
                }
                case "check": {
                    int checkmNum = Integer.parseInt(order[1]);
                    sb.append(set.contains(checkmNum) ? "1\n" : "0\n"); //시간 초과 해결부분 StringBuilder로 해결
                    break;
                }
                case "toggle": {
                    int toggleNum = Integer.parseInt(order[1]);
                    if (set.contains(toggleNum)) {
                        set.remove(toggleNum);
                    } else {
                        set.add(toggleNum);
                    }
                    break;
                }
                case "all": {
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                }
                case "empty": {
                    set.clear();
                    break;
                }
                default:
                    break;
            }
        }

        bw.write(sb.toString());
        bw.close();
    }
}