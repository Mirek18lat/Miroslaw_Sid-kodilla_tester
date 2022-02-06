package com.kodilla.optional.homework;

import java.util.Objects;

class Teacher {
    String name;
    public Teacher (String name) {
        this.name = name;
    }
Teacher optional = new Teacher("<undefined>");

    public String getTeacherName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "nauczyciel: " + name+ ".";
    }
}
