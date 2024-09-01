package com.kavin.hello.kavin;

import com.kavin.hello.kavin.student.Student;
import com.kavin.hello.kavin.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SpringBootApplication

public class HelloKavinApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloKavinApplication.class, args);
	}
	@Bean
	CommandLineRunner cmdline(StudentRepository studentRepository)
	{
		return args -> {
			Student a = new Student("kavin","Fairfax",25);
			Student b = new Student("CJ","Virginia",25);
			Student c = new Student("kevlar","Maryland",27);
			Student d = new Student("Anushka","Dallas",25);

			List<Student> students = List.of(a,b,c,d);
			studentRepository.saveAll(students);
		};
	}

}
