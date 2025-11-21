package org.campus02;

import java.util.ArrayList;
import java.util.HashSet;

public class StudentSetDemo {

    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();
        Student max = new Student(1, "max");
        Student susi = new Student(2, "susi");
        Student john = new Student(3, "john");

        // hinzufügen der Studenten
        students.add(max);
        students.add(susi);
        students.add(john);

        System.out.println(students);
        students.add(john);
        System.out.println(students);
        System.out.println("students.size() = " + students.size());

        students.remove(john);
        System.out.println(students);

        for (Student student : students) {
            System.out.println(student);
        }

        boolean containsMax = students.contains(max);
        boolean containsMax2 = students.contains(new Student(1, "max"));
        System.out.println("containsMax = " + containsMax);
        System.out.println("containsMax2 = " + containsMax2);

        System.out.println(max.hashCode());
        System.out.println(new Student(1, "max").hashCode());

        students.add(new Student(1, "Maria"));
        // ja -> eindeutiger Name
        // Problem mit gleicher Matrikelnummer? durch kombi kein problem und wird hinzugefügt
        System.out.println(students);


        // Zugriff über fullname
        for (Student student : students) {
            if (student.getFullName().equals("max")) {
                students.remove(student);
            }
        }

        ArrayList<Student> studentsList = new ArrayList<>(students);
        ArrayList<Student> studentsList1 = new ArrayList<>();
        for (Student student : students) {
            studentsList1.add(student);
        }
        studentsList1.addAll(students);

        // set komplett leeren
        students.clear();
        System.out.println(students);
    }
}
