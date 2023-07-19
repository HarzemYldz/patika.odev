package patikaOdev;

import java.util.Scanner;

public class EnYakinSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu giriniz: ");
        int n = scanner.nextInt();

        int[] dizi = new int[n];
        System.out.println("Dizi elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int enYakinKucuk = Integer.MIN_VALUE;
        int enYakinBuyuk = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (dizi[i] < sayi && dizi[i] > enYakinKucuk) {
                enYakinKucuk = dizi[i];
            }
            if (dizi[i] > sayi && dizi[i] < enYakinBuyuk) {
                enYakinBuyuk = dizi[i];
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı: " + enYakinKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + enYakinBuyuk);

        scanner.close();
    }
}

