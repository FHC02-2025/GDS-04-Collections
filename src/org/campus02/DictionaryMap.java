package org.campus02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DictionaryMap {

    public static void main(String[] args) {
        // K -> String, DE
        // V -> String, EN

        HashMap<String, String> deToEnDict = new HashMap<>();
        deToEnDict.put("Katze", "Cat");
        deToEnDict.put("Hund", "Dog");
        deToEnDict.put("Loewe", "Lion");

        // zugriff über key
        String katzeInEnglish = deToEnDict.get("Katze");
        System.out.println("katzeInEnglish = " + katzeInEnglish);
        String hundInEnglish = deToEnDict.get("Hund");
        System.out.println(hundInEnglish);

        // überschreiben von Werten
        deToEnDict.put("Katze", "Puma");
        System.out.println(deToEnDict.get("Katze"));
        deToEnDict.put("Katze", "Cat");

        deToEnDict.remove("Loewe");
        System.out.println(deToEnDict);

//        deToEnDict.clear();

        // iterieren
        // 1. Möglichkeit über die keys
        Set<String> deWords = deToEnDict.keySet();
        for (String deWord : deWords) {
            System.out.println(deWord + " heißt auf Englisch " + deToEnDict.get(deWord));
        }

        // 2. Möglichkeit über EntrySet
        for (Map.Entry<String, String> entry : deToEnDict.entrySet()) {
            // habe zugriff auf key
            // habe zugriff auf value
            System.out.println(entry.getKey() + " heißt auf Englisch " + entry.getValue());
        }

        System.out.println(deToEnDict.values());
    }
}
