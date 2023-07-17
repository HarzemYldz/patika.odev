package patikaOdev;

import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. sayıyı girin:");
        int sayi1 = scanner.nextInt();

        System.out.println("2. sayıyı girin:");
        int sayi2 = scanner.nextInt();

        System.out.println("3. sayıyı girin:");
        int sayi3 = scanner.nextInt();

        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            if (sayi2 <= sayi3) {
                System.out.println("Sıralama: " + sayi1 + " " + sayi2 + " " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi1 + " " + sayi3 + " " + sayi2);
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            if (sayi1 <= sayi3) {
                System.out.println("Sıralama: " + sayi2 + " " + sayi1 + " " + sayi3);
            } else {
                System.out.println("Sıralama: " + sayi2 + " " + sayi3 + " " + sayi1);
            }
        } else {
            if (sayi1 <= sayi2) {
                System.out.println("Sıralama: " + sayi3 + " " + sayi1 + " " + sayi2);
            } else {
                System.out.println("Sıralama: " + sayi3 + " " + sayi2 + " " + sayi1);
            }
        }

        scanner.close();
    }
}

