package org.campus02;

import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Integer> uniqueIntegers = new HashSet<>();

        uniqueIntegers.add(1);
        uniqueIntegers.add(2);
        uniqueIntegers.add(3);
        uniqueIntegers.add(1);

        // Wie viele Elemente sind im Set enthalten?
        // => 3
        System.out.println("uniqueIntegers.size() = " + uniqueIntegers.size());

        // Iterieren
        for (Integer n : uniqueIntegers) {
            System.out.println(n);
        }

        // iter + tab => erstellen des foreach konstrukts
        // itar + tab => for schleife (index basiert)


    }
}
