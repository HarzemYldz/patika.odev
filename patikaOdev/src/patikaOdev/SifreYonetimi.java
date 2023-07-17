package patikaOdev;

import java.util.Scanner;

public class SifreYonetimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dogruSifre = "12345"; // Doğru şifre
        String girilenSifre;

        System.out.print("Şifreyi girin: ");
        girilenSifre = scanner.nextLine();

        if (girilenSifre.equals(dogruSifre)) {
            System.out.print("Şifre yanlış. Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni şifreyi girin: ");
                String yeniSifre = scanner.nextLine();

                if (!yeniSifre.equals(dogruSifre)) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }
        }

        scanner.close();
    }
}

