package patikaOdev;

import java.util.Scanner;

public class HarmonikOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz: ");
        int n = scanner.nextInt();

        double[] dizi = new double[n];
        System.out.println("Dizi elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextDouble();
        }

        double harmonikOrtalama = 0;
        int validCount = 0; // Geçerli elemanların sayısını tutmak için

        for (int i = 0; i < n; i++) {
            if (dizi[i] != 0) {
                harmonikOrtalama += 1 / dizi[i];
                validCount++;
            }
        }

        if (validCount > 0) {
            harmonikOrtalama = validCount / harmonikOrtalama;
            System.out.println("Harmonik Ortalama: " + harmonikOrtalama);
        } else {
            System.out.println("Geçerli eleman bulunamadı. Harmonik ortalama hesaplanamadı.");
        }

        scanner.close();
    }
}

