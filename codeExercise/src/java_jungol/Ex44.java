package java_jungol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		InfoPerson[] infoPerson = { new InfoPerson(scanner.next(), scanner.next(), scanner.next()),
				new InfoPerson(scanner.next(), scanner.next(), scanner.next()),
				new InfoPerson(scanner.next(), scanner.next(), scanner.next()) };
		
		scanner.close();

		Comparator<InfoPerson> nameComparator = new Comparator<InfoPerson>() {
			@Override
			public int compare(InfoPerson o1, InfoPerson o2) {
				return o1.nameString.compareTo(o2.nameString);
			}
		};

		Arrays.sort(infoPerson, nameComparator);

		System.out.println("name : " + infoPerson[0].nameString);
		System.out.println("tel : " + infoPerson[0].numString);
		System.out.println("addr : " + infoPerson[0].addressString);
	}
}

class InfoPerson {
	String nameString;
	String numString;
	String addressString;

	public InfoPerson(String nameString, String numString, String addressString) {
		this.nameString = nameString;
		this.numString = numString;
		this.addressString = addressString;
	}
}