package patikaOdev;

import java.util.Scanner;

public class HarmonikSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        double harmonikSerisi = hesaplaHarmonikSerisi(sayi);

        System.out.println("Harmonik Serisi: " + harmonikSerisi);

        scanner.close();
    }

    public static double hesaplaHarmonikSerisi(int n) {
        double harmonikSerisi = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonikSerisi += 1.0 / i;
        }

        return harmonikSerisi;
    }
}

