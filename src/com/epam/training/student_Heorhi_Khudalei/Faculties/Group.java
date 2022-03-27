package com.epam.training.student_Heorhi_Khudalei.Faculties;

public class Group extends Faculty {
    Faculty faculty;
    String name;

    public Group(Faculty faculty, String name) {
        this.faculty = faculty;
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        if (faculty != null ? !faculty.equals(group.faculty) : group.faculty != null) return false;
        return name != null ? name.equals(group.name) : group.name == null;
    }

    @Override
    public int hashCode() {
        int result = faculty != null ? faculty.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
