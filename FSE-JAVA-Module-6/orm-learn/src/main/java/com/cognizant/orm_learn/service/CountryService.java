package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;
    @Transactional
    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }
    @Transactional
    public Country getCountry(String code) {
        return countryRepository.findById(code).orElse(null);
    }
    @Transactional
    public void addCountry(Country country){
        countryRepository.save(country);
    }
    @Transactional
    public void deleteCountry(String code){
        Country country = getCountry(code);
        countryRepository.delete(country);
    }
    @Transactional
    public void updateCountry(Country country){
        countryRepository.save(country);
    }
    @Transactional
    public List<Country> findByNameContainingIgnoreCase(String name){
        return countryRepository.findByNameContainingIgnoreCase(name);
    }
}
