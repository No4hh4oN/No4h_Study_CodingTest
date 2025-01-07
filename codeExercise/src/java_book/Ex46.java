package java_book;

public class Ex46 {
	public static void main(String[] args) {
		String str1 = "Java Programming!";

		System.out.println(str1);
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());

		String tel1 = " 02";
		String tel2 = "    123 ";
		String tel3 = "   4567       ";

		System.out.println(tel1 + tel2 + tel3);
		System.out.println(tel1.trim() + tel2.trim() + tel3.trim());
	}
}
