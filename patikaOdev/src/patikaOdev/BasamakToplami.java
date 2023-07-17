package patikaOdev;

import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int toplam = 0;

        while (sayi != 0) {
            int basamak = sayi % 10;  // Son basamağı elde etmek için sayının 10'a bölümünden kalan alınır
            toplam += basamak;       // Basamağı toplam değişkenine eklenir
            sayi /= 10;              // Sayıyı bir basamak sağa kaydırarak son basamağı çıkartır

            // İsteğe bağlı olarak her adımda basamağı ekrana yazdırmak için kullanılabilir
            // System.out.println("Basamak: " + basamak);
        }

        System.out.println("Basamakların toplamı: " + toplam);

        scanner.close();
    }
}

