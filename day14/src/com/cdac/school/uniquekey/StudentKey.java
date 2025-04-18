package com.cdac.school.uniquekey;

import java.util.Objects;

public class  StudentKey implements Comparable<StudentKey>{
    private String standard;
    private String division;
    private int rollNo;
    public StudentKey(String standard, String division, int rollNo) {
        this.standard = standard;
        this.division = division;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentKey)) return false;
        StudentKey key = (StudentKey) o;
        return rollNo == key.rollNo &&
               Objects.equals(standard, key.standard) &&
               Objects.equals(division, key.division);
    }

    @Override
    public int hashCode() {
        return Objects.hash(standard, division, rollNo);
    }

    @Override
    public int compareTo(StudentKey o) {
        int stdCompare = this.standard.compareTo(o.standard);
        if (stdCompare != 0) return stdCompare;

        int divCompare = this.division.compareTo(o.division);
        if (divCompare != 0) return divCompare;

        return Integer.compare(this.rollNo, o.rollNo);
    }

    @Override
    public String toString() {
        return standard + "-" + division + "-" + rollNo;
    }
}
