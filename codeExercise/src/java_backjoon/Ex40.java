package java_backjoon;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	
    	for(int i = 0; i < N; i++) {
    		for(int j = 0; j < i+1; j++) {
    			System.out.print("*");
    		}
    		for(int j = i+1; j < N; j++) {
    			System.out.print(" ");
    		}

    		for(int j = i+1; j < N; j++) {
    			System.out.print(" ");
    		}
    		for(int j = 0; j < i+1; j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	for(int i = N-1; i > 0; i--) {
    		for(int j = i; j > 0; j-- ) {
    			System.out.print("*");
    		}
    		for(int j = i; j < N; j++) {
    			System.out.print(" ");
    		}
    		for(int j = i; j < N; j++) {
    			System.out.print(" ");
    		}
    		for(int j = i; j > 0; j-- ) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
