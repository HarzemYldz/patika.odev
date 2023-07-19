package patikaOdev;

import java.util.Scanner;

public class RecursiveAsalSayi {

    static boolean isAsal(int sayi, int i) {
        if (sayi <= 2) {
            return (sayi == 2);
        }
        if (sayi % i == 0) {
            return false;
        }
        if (i * i > sayi) {
            return true;
        }
        return isAsal(sayi, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (isAsal(sayi, 2)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }
}

