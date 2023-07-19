package patikaOdev;

public class PalindromSayi {
    public static void main(String[] args) {
        int sayi = 12325;

        if (isPalindrom(sayi)) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }
    }

    static boolean isPalindrom(int num) {
        int temp = num;
        int tersSayi = 0;

        while (temp != 0) {
            int kalan = temp % 10;
            tersSayi = tersSayi * 10 + kalan;
            temp /= 10;
        }

        return num == tersSayi;
    }
}

