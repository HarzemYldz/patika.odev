package patikaOdev;

import java.util.Scanner;

public class ManavTutari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        System.out.print("Armut Kaç Kilo? : ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlicanKilo = scanner.nextDouble();

        double toplamTutar = (armutFiyat * armutKilo) + (elmaFiyat * elmaKilo) + (domatesFiyat * domatesKilo)
                + (muzFiyat * muzKilo) + (patlicanFiyat * patlicanKilo);

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");

        scanner.close();
    }
}

