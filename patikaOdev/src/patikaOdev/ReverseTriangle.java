package patikaOdev;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int basamak = scanner.nextInt();

        for (int i = basamak; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}


