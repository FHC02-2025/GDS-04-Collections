package org.campus02;

import java.util.ArrayList;

public class StudentListDemo {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student max = new Student(1, "Max Mustermann");
        Student susi = new Student(2, "Susi Sorglos");
        Student john = new Student(3, "John Doe");

        // 1. Hinzufügen
        students.add(max);
        students.add(susi);
        students.add(john);
        students.add(new Student(4, "Franzi Musterfrau"));

        System.out.println(students.size());

        // 2. Entfernen
        students.remove(max);

        // 3. Iterieren
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getFullName());
        }

        for (Student student : students) {
            System.out.println(student.getFullName());
        }

        // ist ein Student schon enthalten??
        boolean containsSusi = students.contains(susi);
        System.out.println("containsSusi = " + containsSusi);

        boolean containsMax = students.contains(max);
        System.out.println("containsMax = " + containsMax);

        boolean containsFranzi = students.contains(new Student(4, "Franzi Musterfrau"));
        System.out.println("containsFranzi = " + containsFranzi);

        boolean containsSusi2 = students.contains(new Student(2, "Susi Sorglos"));
        System.out.println("containsSusi2 = " + containsSusi2);

        max.equals(susi);

        System.out.println(max);
        System.out.println(susi);
        System.out.println(new Student(2, "Susi Sorglos"));
    }
}
