package patikaOdev;

import java.util.Scanner;

public class EBOB_EKOK_While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = hesaplaEBOB(sayi1, sayi2);
        int ekok = hesaplaEKOK(sayi1, sayi2);

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

        scanner.close();
    }

    public static int hesaplaEBOB(int sayi1, int sayi2) {
        while (sayi1 != sayi2) {
            if (sayi1 > sayi2) {
                sayi1 -= sayi2;
            } else {
                sayi2 -= sayi1;
            }
        }

        return sayi1;
    }

    public static int hesaplaEKOK(int sayi1, int sayi2) {
        int ebob = hesaplaEBOB(sayi1, sayi2);
        int ekok = (sayi1 * sayi2) / ebob;

        return ekok;
    }
}

