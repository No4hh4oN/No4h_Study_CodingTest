package java_jungol;

import java.util.Scanner;

public class Ex08_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex08_Student student = new Ex08_Student();
		
		student.setSchool(sc.next());
		student.setGrade(sc.nextInt());;
		sc.close();
		
		System.out.println(student.grade + " grade in "+ student.school + " School");
		System.out.println(student.getGrade() + " grade in "+ student.getSchool() + " School");
	}
}