package org.campus02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentMapDemo {

    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> gradesOfStudents = new HashMap<>();

        gradesOfStudents.put("Susi", new ArrayList<>());
        gradesOfStudents.put("Max", new ArrayList<>());

        System.out.println(gradesOfStudents);
        gradesOfStudents.put("Max", new ArrayList<>());
        System.out.println(gradesOfStudents);

        // eingabe der noten für die susi
        ArrayList<Integer> gradesOfSusi = gradesOfStudents.get("Susi");
        gradesOfSusi.add(1);
        gradesOfSusi.add(1);
        gradesOfSusi.add(1);

        // eingabe der noten für den max
        ArrayList<Integer> gradesOfMax = gradesOfStudents.get("Max");
        gradesOfMax.add(1);
        gradesOfMax.add(2);
        gradesOfMax.add(1);

        System.out.println(gradesOfStudents);
        gradesOfStudents.put("john", new ArrayList<>());
        System.out.println(gradesOfStudents);
        gradesOfStudents.remove("john");
        System.out.println(gradesOfStudents);

        boolean containsMax = gradesOfStudents.containsKey("Max");
        System.out.println("containsMax = " + containsMax);

        for (String student : gradesOfStudents.keySet()) {
            System.out.println("student = " + student);
        }

        for (Map.Entry<String, ArrayList<Integer>> entry : gradesOfStudents.entrySet()) {
            System.out.println("Noten von " + entry.getKey() + " : " + entry.getValue());
        }
    }
}
