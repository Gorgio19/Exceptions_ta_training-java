package com.epam.training.student_Heorhi_Khudalei;

import com.epam.training.student_Heorhi_Khudalei.Courses.Course;
import com.epam.training.student_Heorhi_Khudalei.Faculties.Faculty;
import com.epam.training.student_Heorhi_Khudalei.Faculties.Group;
import com.epam.training.student_Heorhi_Khudalei.exceptions.FacultyException;
import com.epam.training.student_Heorhi_Khudalei.exceptions.GroupException;
import com.epam.training.student_Heorhi_Khudalei.exceptions.StudentException;

import java.util.List;

public class University {

    private final List<Student> studentList;

    public University(List<Student> studentList) {
        this.studentList = studentList;
    }

    public double getAverageGradeOfStudentCourses (String name) throws StudentException {
        int sum = 0;
        int amountOfCourses = 0;
        boolean theStudentExists = false;
        for (Student student:this.studentList) {
            if(student.getName().equalsIgnoreCase(name)) {
                theStudentExists = true;
                for (Course courses : student.getCourse()) {
                    sum += courses.getGrade();
                    amountOfCourses++;
                }
            }
        }
        if (!theStudentExists){
            throw new StudentException("no such a student");
        }
        return (double) sum/amountOfCourses;
    }

    public double getAverageGradeByCourseForEntireUniversity(String course){
        int sum = 0;
        int coursesCount = 0;
        for (Student student: this.studentList) {
            for (Course courses: student.getCourse()){
                if (courses.toString().equalsIgnoreCase(course)){
                    sum+= courses.getGrade();
                    coursesCount++;
                }
            }
        }
        return (double) sum/coursesCount;
    }

    public double getAverageByCourseGroupFaculty(String course, Group group, Faculty faculty) throws FacultyException, GroupException {
        int sum = 0;
        int coursesCount = 0;
        boolean groupExists = false;
        boolean facultyExists = false;
        for (Student student: this.studentList){
            if (student.getFaculty().equals(faculty)) {
                facultyExists = true;
                if (student.getGroup().equals(group)) {
                    groupExists = true;
                    for (Course courses : student.getCourse()) {
                        if (courses.toString().equalsIgnoreCase(course)) {
                            sum += courses.getGrade();
                            coursesCount++;
                        }
                    }
                }
            }
            if (!groupExists){
                throw new GroupException("no such a group on this faculty!");
            }
        } if (!facultyExists){
            throw new FacultyException("no such a faculty!");
        }
        return (double) sum/coursesCount;
    }
}
