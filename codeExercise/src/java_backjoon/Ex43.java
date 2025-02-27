package java_backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Ex43 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int order = Integer.parseInt(input[0]);


            switch (order) {
                case 1: {
                    int addNum = Integer.parseInt(input[1]);
                    arrayList.add(addNum);
                    break;
                }
                case 2: {
                    if (arrayList.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(arrayList.get(arrayList.size() - 1) + "\n");
                        arrayList.remove(arrayList.size() - 1);
                    }
                    break;
                }
                case 3: {
                    bw.write(arrayList.size() + "\n");
                    break;
                }
                case 4: {
                    if (arrayList.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                }
                case 5: {
                    if (arrayList.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(arrayList.get(arrayList.size() - 1) + "\n");
                    }
                    break;
                }
                default:
                    break;
            }
            bw.flush();
        }
        bw.close();
    }
}
