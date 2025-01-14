// 정올-연산자-형성평가1 #111
package java_jungol;

import java.util.Scanner;

public class Ex26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Centroid[] centroids = new Centroid[3];

        for (int i = 0; i < 3; i++) {
            centroids[i] = new Centroid(sc.nextInt(), sc.nextInt());
        }
		
        sc.close();
        
		double x = 0;
		double y = 0;
		
		for(Centroid centroid : centroids) {
			x += centroid.getX();
			y += centroid.getY();
		}
		
		System.out.printf("(%.1f, %.1f)", x/3, y/3);
	}
}

class Centroid {
	private int x;
	private int y;

	public Centroid(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}