package java_jungol;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    	String string = scanner.next();
    	String[] strInput = new String[string.length()];
    	
        char[] charArray = string.toCharArray();
        
        for(int i = 0; i < charArray.length; i++) {
        	char temp = charArray[charArray.length-1];
        	for(int j = charArray.length-1; j > 0; j--) {
        		charArray[j] = charArray[j-1];
        	}
        	charArray[0] = temp;
        	strInput[i] = new String(charArray);
        }
        for(int i = 0; i < charArray.length; i++) {
        	System.out.println(strInput[i]);
        }
        
        scanner.close();
    }
}