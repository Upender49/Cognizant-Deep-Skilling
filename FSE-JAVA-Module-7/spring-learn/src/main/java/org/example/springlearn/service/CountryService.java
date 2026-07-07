package org.example.springlearn.service;

import java.util.List;

import org.example.springlearn.Country;

import org.example.springlearn.exception.CountryNotFoundException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Service;

@Service
public class CountryService{
    public Country getCountry(String code) throws CountryNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = context.getBean("countryList", List.class);
        for(Country country: countries){
            if(country.getCode().equalsIgnoreCase(code)){
                return country;
            }
        }
        throw new CountryNotFoundException();
    }
}
