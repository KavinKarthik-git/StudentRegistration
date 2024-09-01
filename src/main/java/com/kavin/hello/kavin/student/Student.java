package com.kavin.hello.kavin.student;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Student {
    @Id
    @SequenceGenerator(name = "id_sq",sequenceName = "id_sq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_sq")
    private Integer id;
    @Column(nullable = false)
    private String name;

    private String address;

    @Column(nullable = false)
    private Integer age;
    public Student(){}
    public Student(String name, Integer id, String address, Integer age) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.age = age;
    }
    public Student(String name, String address, Integer age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(id, student.id) && Objects.equals(address, student.address) && Objects.equals(age, student.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, address, age);
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }
}
