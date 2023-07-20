package patikaOdev;

import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 0;
        int max = 100;

        // Rastgele sayı üretme işlemi
        int rastgeleSayi = (int) (Math.random() * (max - min + 1)) + min;
        int tahmin;
        int tahminSayisi = 0;

        System.out.println("0 ile 100 arasında bir sayıyı tahmin edin.");

        do {
            System.out.print("Tahmininiz: ");
            tahmin = input.nextInt();
            tahminSayisi++;

            if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayı girin.");
            } else {
                System.out.println("Tebrikler! Doğru sayıyı tahmin ettiniz.");
                System.out.println("Tahmin sayınız: " + tahminSayisi);
                break;
            }
        } while (true);

        input.close();
    }
}

