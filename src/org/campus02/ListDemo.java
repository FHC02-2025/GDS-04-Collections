package org.campus02;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>(); // STRG + ALT + V => variable erzeugen

        // hinzufügen
        stringArrayList.add("Hallo");
        //stringArrayList.add(1);
        stringArrayList.add("liebe");
        stringArrayList.add("Studenten");

        // 3 Elemente bis jetzt
        stringArrayList.add("!");
        // 4 Elemente bis jetzt

        System.out.println(stringArrayList);

        // Größe feststellen
        int size = stringArrayList.size(); // gibt mir die Größe zurück
        System.out.println("size = " + size);

        // Zugriff auf die Elemente
        // index-basierter Zugriff
        String firstElement = stringArrayList.get(0);
        String secondElement = stringArrayList.get(1);
        String lastElement = stringArrayList.get(size - 1);
        // index : Element
        // 0 : Hallo
        // 1 : liebe
        // 2 : Studenten
        // 3 : !

        System.out.println("firstElement = " + firstElement);
        System.out.println("secondElement = " + secondElement);
        System.out.println("lastElement = " + lastElement);


        // remove => entfernt elemente von der liste
        boolean isRemoved = stringArrayList.remove("Hallo");
        String removedElement = stringArrayList.remove(0);
        System.out.println(stringArrayList);
        System.out.println("isRemoved = " + isRemoved);
        System.out.println("removedElement = " + removedElement);

        isRemoved = stringArrayList.remove("Hallo");
        System.out.println("isRemoved = " + isRemoved);

        // Ist ein Element bereits enthalten => contains
        System.out.println("stringArrayList = " + stringArrayList);
        boolean containsLiebe = stringArrayList.contains("liebe");
        System.out.println("containsLiebe = " + containsLiebe);

        boolean containsStudenten = stringArrayList.contains("Studenten");
        System.out.println("containsStudenten = " + containsStudenten);


        // iterieren -> wie kann ich die liste durchlaufen
        // 2 Möglichkeiten
        // 1. for-schleifen
        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(stringArrayList.get(i));
        }

        // 2. for-each
        for (String element : stringArrayList) {
            System.out.println(element);
        }
    }
}
