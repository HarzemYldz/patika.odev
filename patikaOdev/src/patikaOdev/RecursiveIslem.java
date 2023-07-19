package patikaOdev;

public class RecursiveIslem {

    static void kuralaUyanMetot(int n) {
        if (n <= 0) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        kuralaUyanMetot(n - 5);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 20; // Kullanıcıdan alınacak değeri temsil etmektedir.

        System.out.println("Kurala uyan işlem:");
        kuralaUyanMetot(n);
    }
}

