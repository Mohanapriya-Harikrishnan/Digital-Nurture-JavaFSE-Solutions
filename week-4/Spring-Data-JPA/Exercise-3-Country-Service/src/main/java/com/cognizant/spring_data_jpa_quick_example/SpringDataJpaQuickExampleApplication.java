package com.cognizant.spring_data_jpa_quick_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.spring_data_jpa_quick_example.service.CountryService;

@SpringBootApplication
public class SpringDataJpaQuickExampleApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaQuickExampleApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("Country List");

        countryService.getAllCountries().forEach(System.out::println);
    }
}