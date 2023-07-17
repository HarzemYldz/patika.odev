
package patikaOdev; 
import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Para miktarını girin: ");
        double paraMiktari = scanner.nextDouble();

        double kdvOrani;
        if (paraMiktari > 0 && paraMiktari <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        double kdvTutari = paraMiktari * kdvOrani;
        double kdvliFiyat = paraMiktari + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + paraMiktari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV Tutarı: " + kdvTutari);

        scanner.close();
    }
}

