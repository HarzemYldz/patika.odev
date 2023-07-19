package patikaOdev;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int n = 20; // Fibonacci serisinde kaçıncı terimi bulmak istediğimizi belirtiyoruz

        System.out.println("Fibonacci serisi:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

