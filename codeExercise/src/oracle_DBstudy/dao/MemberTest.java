package oracle_DBstudy.dao;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input ename...? " );
		String nameString = sc.nextLine();
		sc.close();
		
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberVo> list = dao.list(nameString);

		for (int i = 0; i < list.size(); i++) {
			MemberVo data = (MemberVo) list.get(i);
			String empno = data.getEmpno();
			String ename = data.getEname();
			int sal = data.getSal();

			System.out.println(empno + " : " + ename + " : " + sal);
		}

	}

}
