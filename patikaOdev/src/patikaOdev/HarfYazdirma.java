package patikaOdev;

public class HarfYazdirma {
    public static void main(String[] args) {
        // "B" harfini oluşturan yıldızlı desenin boyutu
        int boyut = 7;

        // Çok boyutlu bir dizi kullanarak "B" harfini oluşturma
        char[][] harfDizisi = new char[boyut][boyut];

        // "B" harfini yıldızlarla doldurma
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                if (i == 0 || i == boyut - 1 || i == boyut / 2 || j == 0 || j == boyut - 1)
                    harfDizisi[i][j] = '*';
                else
                    harfDizisi[i][j] = ' ';
            }
        }

        // "B" harfini ekrana yazdırma
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                System.out.print(harfDizisi[i][j] + " ");
            }
            System.out.println();
        }
    }
}


