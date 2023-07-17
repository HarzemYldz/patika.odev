package patikaOdev;

import java.util.Scanner;

public class CiftVeDortunKatlari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int sayi;

        do {
            System.out.print("Bir sayı giriniz (Programı sonlandırmak için 0 girin): ");
            sayi = scanner.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        } while (sayi != 0);

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);

        scanner.close();
    }
}
