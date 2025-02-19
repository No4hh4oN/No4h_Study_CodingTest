package java_jungol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Info[] infos = {
            new Info(scanner.next(), scanner.nextInt(), scanner.nextDouble()),
            new Info(scanner.next(), scanner.nextInt(), scanner.nextDouble()),
            new Info(scanner.next(), scanner.nextInt(), scanner.nextDouble()),
            new Info(scanner.next(), scanner.nextInt(), scanner.nextDouble()),
            new Info(scanner.next(), scanner.nextInt(), scanner.nextDouble())
        };
        
        Arrays.sort(infos, Comparator.comparing(info -> info.name));
        
        System.out.println("name");
        for (Info info : infos) {
            System.out.println(info.name + " " + info.height + " " + info.weight);
        }
        
        Arrays.sort(infos, Comparator.comparingDouble(info -> -info.weight));
        
        System.out.println("\nweight");
        for (Info info : infos) {
            System.out.println(info.name + " " + info.height + " " + info.weight);
        }
        
        scanner.close();
    }
}

class Info {
    String name;
    int height;
    double weight;

    public Info(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
