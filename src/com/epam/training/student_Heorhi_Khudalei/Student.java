package com.epam.training.student_Heorhi_Khudalei;

import com.epam.training.student_Heorhi_Khudalei.Courses.Course;;
import com.epam.training.student_Heorhi_Khudalei.Faculties.Faculty;
import com.epam.training.student_Heorhi_Khudalei.Faculties.Group;
import com.epam.training.student_Heorhi_Khudalei.exceptions.CoursesException;
import com.epam.training.student_Heorhi_Khudalei.exceptions.GroupException;

public class Student {
    String name;
    Faculty faculty;
    Group group;
    Course[] course;

    public Student(String name, Faculty faculty, Group group, Course[] course) throws CoursesException, GroupException {
        this.name = name;
        this.faculty = faculty;
        this.group = group;
        this.course = course;

        if (course.length == 0){
            throw new CoursesException("zero courses, please pick up one at least");
        }

        if(!group.getFaculty().equals(this.faculty)){
            throw new GroupException("the group doesn't belong to the faculty!");
        }
    }

    public String getName() {
        return name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Group getGroup() {
        return group;
    }

    public Course[] getCourse() {
        return course;
    }

}
