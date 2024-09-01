package com.kavin.hello.kavin.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository("list")
public class StudentDataAccessService implements StudentDAO {

    public static List<Student> students;
    static{
        students = new ArrayList<>();
        Student a = new Student("kavin",1,"Fairfax",25);
        Student b = new Student("CJ",2,"Virginia",25);
        Student c = new Student("kevlar",3,"Maryland",27);
        Student d = new Student("Anushka",4,"Dallas",25);
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);
    }
    @Override
    public List<Student> selectAllStudent() {
        return students;
    }

    @Override
    public Optional<Student> selectStudentByID(Integer id) {
        return students.stream().filter(student -> student.getId().equals(id))
                .findFirst();
    }

    @Override
    public void addStudent(Student student) {
         students.add(student);
    }

    @Override
    public boolean isNameExist(String name) {
        return students.stream().anyMatch(student -> student.getName().equals(name));
    }

    @Override
    public void deleteStudent(Integer id) {

    }

    @Override
    public boolean isIdExist(Integer id) {
        return false;
    }

    @Override
    public void updateStudent(Student std) {

    }




}
