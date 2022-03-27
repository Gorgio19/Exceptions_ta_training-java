package com.epam.training.student_Heorhi_Khudalei.Courses;

import com.epam.training.student_Heorhi_Khudalei.exceptions.GradeException;

public class Course {
    int grade;

    public Course() {
    }

    public Course(int grade) throws GradeException {
        this.grade = grade;
        if (grade > 10 || grade < 0) {
            throw new GradeException("the grade cannot be negative or more than 10!");
        }
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course courses = (Course) o;

        return grade == courses.grade;
    }

    @Override
    public int hashCode() {
        return grade;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "grade=" + grade +
                '}';
    }
}
