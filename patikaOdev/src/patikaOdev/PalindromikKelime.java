package patikaOdev;

import java.util.Scanner;

public class PalindromikKelime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();
        scanner.close();

        if (kelimePalindromikMi(kelime)) {
            System.out.println(kelime + " bir palindromik kelimedir.");
        } else {
            System.out.println(kelime + " bir palindromik kelime değildir.");
        }
    }

    public static boolean kelimePalindromikMi(String kelime) {
        // Kelimenin uzunluğunu alalım
        int uzunluk = kelime.length();

        // Kelimenin ilk yarısını ve ikinci yarısını alalım
        String ilkYaris = kelime.substring(0, uzunluk / 2);
        String ikinciYaris = kelime.substring(uzunluk - uzunluk / 2);

        // Eğer kelimenin uzunluğu tekse, ortadaki karakteri atlayalım
        if (uzunluk % 2 != 0) {
            ikinciYaris = kelime.substring(uzunluk - uzunluk / 2 - 1);
        }

        // İlk yarıyı ters çevirelim
        String tersIlkYaris = new StringBuilder(ilkYaris).reverse().toString();

        // İlk yarı ile ikinci yarıyı karşılaştıralım
        return tersIlkYaris.equals(ikinciYaris);
    }
}

