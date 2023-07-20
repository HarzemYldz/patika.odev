package patikaOdev;

import java.util.Arrays;

public class MatrisTranspozu {
    public static void main(String[] args) {
        // Örnek matrisi oluşturalım
        int[][] matris = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Matrisin transpozunu alalım
        int[][] transpoz = transpozeAl(matris);

        // Transpozunu yazdıralım
        System.out.println("Matris:");
        matrisiYazdir(matris);

        System.out.println("\nMatrisin Transpozu:");
        matrisiYazdir(transpoz);
    }

    // Matrisi ekrana yazdıran metod
    public static void matrisiYazdir(int[][] matris) {
        for (int[] row : matris) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Matrisin transpozunu alan metod
    public static int[][] transpozeAl(int[][] matris) {
        int rowLength = matris.length;
        int colLength = matris[0].length;

        int[][] transpoz = new int[colLength][rowLength];

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        return transpoz;
    }
}


