package patikaOdev;

import java.util.HashMap;
import java.util.Map;

public class FrekansBulma {
    public static void main(String[] args) {
        int[] dizi = {2, 5, 7, 4, 2, 6, 4, 8, 6, 5, 9, 8};

        // Elemanların frekanslarını tutmak için bir Map kullanıyoruz
        Map<Integer, Integer> frekanslar = new HashMap<>();

        // Dizideki elemanların frekansını hesapla
        for (int eleman : dizi) {
            if (frekanslar.containsKey(eleman)) {
                // Eleman zaten frekanslar Map'inde varsa frekansını 1 arttır
                frekanslar.put(eleman, frekanslar.get(eleman) + 1);
            } else {
                // Elemanı frekanslar Map'ine ekle ve frekansını 1 olarak ayarla
                frekanslar.put(eleman, 1);
            }
        }

        // Elemanların frekansını ekrana yazdır
        for (Map.Entry<Integer, Integer> entry : frekanslar.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " kez tekrar edildi.");
        }
    }
}

