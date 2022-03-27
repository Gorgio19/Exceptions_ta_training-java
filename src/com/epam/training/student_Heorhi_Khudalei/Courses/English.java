package com.epam.training.student_Heorhi_Khudalei.Courses;

import com.epam.training.student_Heorhi_Khudalei.exceptions.GradeException;

public class English extends Course {

    public English() {
    }

    public English(int grade) throws GradeException {
        super(grade);
    }

    @Override
    public String toString() {
        return "English";
    }

}
