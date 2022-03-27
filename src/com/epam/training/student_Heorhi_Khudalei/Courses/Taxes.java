package com.epam.training.student_Heorhi_Khudalei.Courses;

import com.epam.training.student_Heorhi_Khudalei.exceptions.GradeException;

public class Taxes extends Course{

    public Taxes() {
    }

    public Taxes(int grade) throws GradeException {
        super(grade);
    }

    @Override
    public String toString() {
        return "Taxes";
    }
}
