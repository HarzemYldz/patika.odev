package patikaOdev;

import java.util.ArrayList;
import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> notlar = new ArrayList<>();

        System.out.println("Matematik notunu girin:");
        int matematikNotu = scanner.nextInt();
        if (matematikNotu >= 0 && matematikNotu <= 100) {
            notlar.add(matematikNotu);
        }

        System.out.println("Fizik notunu girin:");
        int fizikNotu = scanner.nextInt();
        if (fizikNotu >= 0 && fizikNotu <= 100) {
            notlar.add(fizikNotu);
        }

        System.out.println("Türkçe notunu girin:");
        int turkceNotu = scanner.nextInt();
        if (turkceNotu >= 0 && turkceNotu <= 100) {
            notlar.add(turkceNotu);
        }

        System.out.println("Kimya notunu girin:");
        int kimyaNotu = scanner.nextInt();
        if (kimyaNotu >= 0 && kimyaNotu <= 100) {
            notlar.add(kimyaNotu);
        }

        System.out.println("Müzik notunu girin:");
        int muzikNotu = scanner.nextInt();
        if (muzikNotu >= 0 && muzikNotu <= 100) {
            notlar.add(muzikNotu);
        }

        scanner.close();

        double toplam = 0;
        int dersSayisi = notlar.size();

        for (int not : notlar) {
            toplam += not;
        }

        double ortalama = toplam / dersSayisi;
        System.out.println("Ortalama: " + ortalama);

        if (ortalama >= 55) {
            System.out.println("Geçtiniz!");
        } else {
            System.out.println("Kaldınız!");
        }
    }
}

