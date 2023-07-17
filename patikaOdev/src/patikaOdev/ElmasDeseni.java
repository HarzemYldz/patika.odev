package patikaOdev;

import java.util.Scanner;

public class ElmasDeseni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmas deseni için satır sayısını giriniz: ");
        int satirSayisi = scanner.nextInt();

        // Üst kısmı çizdir
        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = 1; j <= satirSayisi - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Alt kısmı çizdir
        for (int i = satirSayisi - 1; i >= 1; i--) {
            for (int j = 1; j <= satirSayisi - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}

