package com.epam.training.student_Heorhi_Khudalei.Courses;

import com.epam.training.student_Heorhi_Khudalei.exceptions.GradeException;

public class History extends Course{

    public History() {
    }

    public History(int grade) throws GradeException {
        super(grade);
    }

    @Override
    public String toString() {
        return "History";
    }
}
