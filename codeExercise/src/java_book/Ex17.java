// 정올-구조체-자가진단1 #613
package java_book;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentInfo stu1 = new StudentInfo();

		String nameString = sc.next();
		stu1.setName(nameString);

		String schoolString = sc.next();
		stu1.setSchool(schoolString);

		stu1.grade = sc.nextInt();

		System.out.println("Name : " + stu1.getName());
		System.out.println("School : " + stu1.getSchool());
		System.out.println("Grade : " + stu1.grade);
	}
}

class StudentInfo {
	private String name;
	private String school;
	int grade;

	public void setName(String pname) {
		name = pname;
	}

	public void setSchool(String pschool) {
		school = pschool;
	}

	public String getName() {
		return name;
	}

	public String getSchool() {
		return school;
	}
}