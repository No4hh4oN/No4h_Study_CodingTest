package java_book;

public class Ex04 {
	public static void main(String[] args) {
		double d = 12.33333333333333;
		float f = 12.3333333333333f;
//		12.33333333333333
//		12.333333  float는 여기서 컷

		System.out.println(d);
		System.out.println(f);

		long var1 = 10;
		long var2 = 200L;
		// long var3 = 1000000000000; L을 안 붙이면 오류남
		long var4 = 1000000000000L;

		System.out.println(var1);
		System.out.println(var2);
		// System.out.println(var3);
		System.out.println(var4);
	}
}
