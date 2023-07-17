package patikaOdev;

import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin ilk kenar uzunluğunu girin: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("Üçgenin ikinci kenar uzunluğunu girin: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("Üçgenin üçüncü kenar uzunluğunu girin: ");
        double kenar3 = scanner.nextDouble();

        double u = (kenar1 + kenar2 + kenar3) / 2.0;
        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

        System.out.println("Üçgenin alanı: " + alan);

        scanner.close();
    }
}
