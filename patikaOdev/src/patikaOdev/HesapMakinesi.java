package patikaOdev;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hesap Makinesine Hoş Geldiniz!");
        System.out.print("İlk sayıyı girin: ");
        double num1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        int secim = scanner.nextInt();

        double sonuc;
        switch (secim) {
            case 1:
                sonuc = num1 + num2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 2:
                sonuc = num1 - num2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 3:
                sonuc = num1 * num2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case 4:
                if (num2 != 0) {
                    sonuc = num1 / num2;
                    System.out.println("Sonuç: " + sonuc);
                } else {
                    System.out.println("Bir sayıyı 0'a bölemezsiniz!");
                }
                break;
            default:
                System.out.println("Geçersiz bir seçim yaptınız.");
        }

        scanner.close();
    }
}

