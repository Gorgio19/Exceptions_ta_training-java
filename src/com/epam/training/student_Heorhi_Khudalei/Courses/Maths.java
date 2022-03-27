package com.epam.training.student_Heorhi_Khudalei.Courses;

import com.epam.training.student_Heorhi_Khudalei.exceptions.GradeException;

public class Maths extends Course {

    public Maths() {
    }

    public Maths(int grade) throws GradeException {
        super(grade);
    }

    @Override
    public String toString() {
        return "Maths";
    }
}
