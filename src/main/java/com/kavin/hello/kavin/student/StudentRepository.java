package com.kavin.hello.kavin.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    boolean existsByName(String name);
}
