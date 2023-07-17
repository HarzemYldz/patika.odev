package patikaOdev;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        int fib1 = 0;
        int fib2 = 1;

        System.out.print("Fibonacci serisi: " + fib1 + " " + fib2);

        for (int i = 2; i < elemanSayisi; i++) {
            int nextFib = fib1 + fib2;
            System.out.print(" " + nextFib);

            fib1 = fib2;
            fib2 = nextFib;
        }

        scanner.close();
    }
}

