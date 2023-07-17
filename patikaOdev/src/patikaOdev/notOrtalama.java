
package patikaOdev;
import java.util.Scanner;
public class notOrtalama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik sınav puanını girin: ");
        double matematik = scanner.nextDouble();

        System.out.print("Fizik sınav puanını girin: ");
        double fizik = scanner.nextDouble();

        System.out.print("Kimya sınav puanını girin: ");
        double kimya = scanner.nextDouble();

        System.out.print("Türkçe sınav puanını girin: ");
        double turkce = scanner.nextDouble();

        System.out.print("Tarih sınav puanını girin: ");
        double tarih = scanner.nextDouble();

        System.out.print("Müzik sınav puanını girin: ");
        double muzik = scanner.nextDouble();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Ortalama: " + ortalama);

        String sinifDurumu = ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sinifDurumu);

        scanner.close();
    }
}
