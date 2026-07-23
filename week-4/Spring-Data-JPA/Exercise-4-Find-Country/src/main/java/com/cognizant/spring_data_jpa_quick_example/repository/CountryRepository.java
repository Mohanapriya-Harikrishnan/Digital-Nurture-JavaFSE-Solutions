package com.cognizant.spring_data_jpa_quick_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.spring_data_jpa_quick_example.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
    Country findByCode(String code);

}