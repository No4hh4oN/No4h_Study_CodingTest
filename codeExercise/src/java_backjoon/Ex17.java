// 백준10212-Mystery
package java_backjoon;

public class Ex17 {
	public static void main(String[] args) {
		int myTime = 0 + (int) (Math.random() * ((1 - 0) + 1));

        String result = "Korea";
        if (myTime % 2 == 0) {
            result = "Yonsei";
        }
        System.out.print(result);
	}
}
