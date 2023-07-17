package patikaOdev;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz?: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

        scanner.close();
    }
}

