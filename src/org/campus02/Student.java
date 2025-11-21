package org.campus02;

import java.util.Objects;

public class Student {

    private int matrNr;
    private String fullName;

    public Student(int matrNr, String fullName) {
        this.matrNr = matrNr;
        this.fullName = fullName;
    }

    // ALT + EINFG -> Getter
    // mit get beginnen und auswählen
    public String getFullName() {
        return fullName;
    }

    // ALT + EINFG -> equals() and hashcode()

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return matrNr == student.matrNr && Objects.equals(fullName, student.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matrNr, fullName);
    }
}
