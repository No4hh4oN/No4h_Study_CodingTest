//백준 올림픽 < -- 코드 리뷰 한번 더 해야될듯

package java_backjoon;

import java.util.*;

public class Ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 국가 수
        int targetCountry = sc.nextInt(); // 순위를 알고 싶은 국가 번호

        List<int[]> countries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int gold = sc.nextInt();
            int silver = sc.nextInt();
            int bronze = sc.nextInt();
            countries.add(new int[]{id, gold, silver, bronze});
        }

        // 정렬 (금 -> 은 -> 동 순으로 내림차순)
        countries.sort((a, b) -> {
            if (b[1] != a[1]) return Integer.compare(b[1], a[1]); // 금 비교
            if (b[2] != a[2]) return Integer.compare(b[2], a[2]); // 은 비교
            return Integer.compare(b[3], a[3]); // 동메달 비교
        });

        // 해당 국가 순위 찾기
        int rank = 1;
        for (int i = 0; i < countries.size(); i++) {
            if (i > 0) {
                int[] prev = countries.get(i - 1);
                int[] curr = countries.get(i);
                if (prev[1] == curr[1] && prev[2] == curr[2] && prev[3] == curr[3]) {
                    // 메달 수가 같으면 같은 순위 유지
                } else {
                    rank = i + 1; // 새로운 순위 할당
                }
            }

            if (countries.get(i)[0] == targetCountry) {
                System.out.println(rank);
                break;
            }
        }

        sc.close();
    }
}
