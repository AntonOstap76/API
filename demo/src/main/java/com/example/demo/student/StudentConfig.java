package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
            Student john= new Student(
                            "John",
                            "john1@gmail.com",
                            LocalDate.of(2000, Month.JUNE, 30));
            Student alex= new Student(
                    "Alex",
                    "alex2@gmail.com",
                    LocalDate.of(2005, Month.JULY, 6));
            repository.saveAll(
                    List.of(john, alex)
            );
        };
    }
}
