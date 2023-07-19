package patikaOdev;

import java.util.HashMap;
import java.util.Map;

public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] dizi = {2, 5, 7, 4, 2, 6, 4, 8, 6, 5, 9, 8};

        Map<Integer, Integer> frekanslar = new HashMap<>();

        for (int sayi : dizi) {
            // Sadece çift sayıları kontrol ediyoruz
            if (sayi % 2 == 0) {
                if (frekanslar.containsKey(sayi)) {
                    // Eğer sayı daha önce eklenmişse, frekansını 1 arttırıyoruz
                    frekanslar.put(sayi, frekanslar.get(sayi) + 1);
                } else {
                    // Sayı ilk defa ekleniyorsa, frekansını 1 olarak ayarlıyoruz
                    frekanslar.put(sayi, 1);
                }
            }
        }

        // Tekrar eden çift sayıları ekrana yazdırma
        System.out.println("Tekrar eden çift sayılar: ");
        for (Map.Entry<Integer, Integer> entry : frekanslar.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

