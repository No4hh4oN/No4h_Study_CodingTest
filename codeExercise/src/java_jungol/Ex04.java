// 정올-선택제어문-자가진단1 #528
package java_jungol;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.println(n);
		if (n < 0) {
			System.out.println("minus");
		}
	}
}

//import java.io.*;
//
//class Main{
//    public static void main(String args[])throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int input = Integer.parseInt(br.readLine());
//        if(input<0){
//            bw.write(String.valueOf(input)+"\nminus");
//        }
//        else{
//            bw.write(String.valueOf(input));
//        }
//        bw.flush();
//    }
//}