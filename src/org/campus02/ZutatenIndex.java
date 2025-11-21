package org.campus02;

import java.util.ArrayList;
import java.util.HashMap;


public class ZutatenIndex {

    public static void main(String[] args) {

        // Key -> Zutaten
        // Value -> Liste an Seiten, wo die Zutat vorkommt
        HashMap<String, ArrayList<Integer>> zutatenIndex = new HashMap<>();

        // 1. Eintrag Mehl
        ArrayList<Integer> mehlSeiten = new ArrayList<>();
        mehlSeiten.add(1);
        mehlSeiten.add(2);
        zutatenIndex.put("Mehl", mehlSeiten);


        // jetzt bin ich auf Seite 88 und habe wieder mehl gefunden.
        // was nun?
        ArrayList<Integer> mehlSeitenVonMap = zutatenIndex.get("Mehl");
        System.out.println(mehlSeitenVonMap);
        mehlSeitenVonMap.add(88);
//        zutatenIndex.put("Mehl", mehlSeitenVonMap);
        System.out.println(mehlSeitenVonMap);

        // Zucker
        ArrayList<Integer> zuckerSeiten = new ArrayList<>();
        zuckerSeiten.add(1);
        zuckerSeiten.add(2);
        zuckerSeiten.add(3);
        zuckerSeiten.add(4);
        zutatenIndex.put("Zucker", zuckerSeiten);

        for (String zutat : zutatenIndex.keySet()) {
            ArrayList<Integer> seiten = zutatenIndex.get(zutat);
            for (Integer seite : seiten) {
                System.out.println(zutat + " ist auf Seite " + seite + " zu finden");
            }
        }

    }
}
