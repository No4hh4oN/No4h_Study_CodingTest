package java_book;

public class Ex45 {
	public static void main(String[] args) {
		String oldstr = "Java의 가장 큰 특징은 플랫폼에 독립적이라는 것입니다.\n";
		System.out.println("oldstr : " + oldstr);

		String newstr = oldstr.replace("Java", "자바");

		System.out.println("변경 후\nnewstr : " + newstr);
	}
}
