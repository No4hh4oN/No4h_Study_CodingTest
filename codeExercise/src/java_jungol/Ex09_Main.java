// 구조체-자가진단2 #614
package java_jungol;

import java.util.Scanner;

public class Ex09_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex09_Student student = new Ex09_Student();
		
		student.setStudent(sc.next(), sc.nextInt());
		sc.close();
		
		System.out.println(student.grade + " grade in "+ student.school + " School");
		System.out.println(student.getGrade() + " grade in "+ student.getSchool() + " School");
	}
}