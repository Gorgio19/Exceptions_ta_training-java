package com.epam.training.student_Heorhi_Khudalei;

import com.epam.training.student_Heorhi_Khudalei.Courses.*;
import com.epam.training.student_Heorhi_Khudalei.Faculties.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Faculty ffbd = new Faculty();
    private static final Faculty fkti = new Faculty();
    private static final Faculty fmo = new Faculty();
    private static final Group dff = new Group(ffbd, "dff");
    private static final Group dfk = new Group(ffbd, "dfk");
    private static final Group dzz = new Group(fkti, "dzz");
    private static final Group dss = new Group(fkti, "dss");
    private static final Group dmb = new Group(fmo, "dmb");
    private static final Group dsp = new Group(fmo, "dsp");

    public static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        studentList.add(new Student("Alexey", ffbd, dff, new Course[]{new Maths(8), new English(8), new Taxes(7)}));
        studentList.add(new Student("George", ffbd, dff, new Course[]{new English(10), new Taxes(5), new Finances(7)}));
        studentList.add(new Student("Valentin", ffbd, dfk, new Course[]{new Finances(4), new Maths(6)}));
        studentList.add(new Student("Klim", ffbd, dfk, new Course[]{new Taxes(4)}));
        studentList.add(new Student("Nastya", fkti, dzz, new Course[]{new Taxes(5), new English(6)}));
        studentList.add(new Student("Sasha", fkti, dzz, new Course[]{new History(3), new Maths(5)}));
        studentList.add(new Student("Alesya", fkti, dss, new Course[]{new Finances(7), new English(7)}));
        studentList.add(new Student("Andrey", fkti, dzz, new Course[]{new English(5), new History(4)}));
        studentList.add(new Student("Pasha", fmo, dmb, new Course[]{new English(6)}));
        studentList.add(new Student("Emmanuel", fmo, dmb, new Course[]{new History(4), new Taxes(7)}));
        studentList.add(new Student("Ke Chening", fmo, dsp, new Course[]{new Finances(4), new English(8)}));
        studentList.add(new Student("Shi Yinle", fmo, dsp, new Course[]{new English(4), new Maths(5), new History(6)}));

        University bseu = new University(studentList);
        System.out.println(bseu.getAverageGradeOfStudentCourses("George"));
        System.out.println(bseu.getAverageGradeByCourseForEntireUniversity("English"));
        System.out.println(bseu.getAverageByCourseGroupFaculty("Taxes", dff, ffbd));

    }
}
