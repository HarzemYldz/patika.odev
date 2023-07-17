package patikaOdev;

import java.util.Scanner;

public class DaireDilimiAlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını (r) girin: ");
        double yaricap = scanner.nextDouble();

        System.out.print("Merkez açısının ölçüsünü (α) girin: ");
        double aci = scanner.nextDouble();

        double pi = 3.14;
        double alan = (pi * (yaricap * yaricap) * aci) / 360.0;

        System.out.println("Daire diliminin alanı: " + alan);

        scanner.close();
    }
}
