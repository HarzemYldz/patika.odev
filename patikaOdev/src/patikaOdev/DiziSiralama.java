package patikaOdev;

import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizinin boyutunu kullanıcıdan alın
        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();

        // Dizi oluşturma ve elemanları kullanıcıdan alın
        int[] dizi = new int[boyut];
        System.out.println("Dizinin elemanlarını girin: ");
        for (int i = 0; i < boyut; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        // Diziyi küçükten büyüğe sıralama
        Arrays.sort(dizi);

        // Sıralanmış diziyi ekrana yazdırma
        System.out.println("Dizinin küçükten büyüğe sıralanmış hali: ");
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
    }
}

