package com.epam.training.student_Heorhi_Khudalei.Courses;

import com.epam.training.student_Heorhi_Khudalei.exceptions.GradeException;

public class Finances extends Course {

    public Finances() {
    }

    public Finances(int grade) throws GradeException {
        super(grade);
    }

    @Override
    public String toString() {
        return "Finances";
    }
}

