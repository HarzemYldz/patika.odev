package patikaOdev;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi (KM) girin: ");
        double mesafe = scanner.nextDouble();

        double tutar = 10.0 + (mesafe * 2.20);
        if (tutar < 20.0) {
            tutar = 20.0;
        }

        System.out.println("Taksimetre Tutarı: " + tutar + " TL");

        scanner.close();
    }
}
