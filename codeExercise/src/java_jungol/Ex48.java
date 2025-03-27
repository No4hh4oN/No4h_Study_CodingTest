package java_jungol;

import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] dir = new int[6];
        int[] len = new int[6];
        int maxW = 0, maxH = 0;
        int maxWIdx = 0, maxHIdx = 0;
        
        for (int i = 0; i < 6; i++) {
            dir[i] = sc.nextInt();
            len[i] = sc.nextInt();

            if ((dir[i] == 1 || dir[i] == 2) && len[i] > maxW) {
                maxW = len[i];
                maxWIdx = i;
            }
            if ((dir[i] == 3 || dir[i] == 4) && len[i] > maxH) {
                maxH = len[i];
                maxHIdx = i;
            }
        }

        int smallW = Math.abs(len[(maxWIdx + 3) % 6] - len[(maxWIdx + 5) % 6]);
        int smallH = Math.abs(len[(maxHIdx + 3) % 6] - len[(maxHIdx + 5) % 6]);

        int area = (maxW * maxH) - (smallW * smallH);
        System.out.println(area * N);

        sc.close();
    }
}
