package com.example.springbootjava.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student petch = new Student(
                    1L,
                    "Kittichan",
                    "kittichan@gmail.com",
                    LocalDate.of(1997, Month.JANUARY, 31)

            );
            Student jame = new Student(
                    2L,
                    "jame",
                    "jame@gmail.com",
                    LocalDate.of(1992, Month.MARCH, 31)
            );

            studentRepository.saveAll(List.of(petch, jame));
        };
    }
}
