package com.kavin.hello.kavin.student;
import java.util.List;

import java.util.Optional;

public interface StudentDAO {

    List<Student> selectAllStudent();

    Optional<Student> selectStudentByID(Integer id);

    void addStudent(Student student);
    boolean isNameExist(String name);
    void deleteStudent(Integer id);
    boolean isIdExist(Integer id);
    void updateStudent(Student std);
}
