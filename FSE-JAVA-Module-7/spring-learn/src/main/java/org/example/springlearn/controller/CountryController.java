package org.example.springlearn.controller;

import jakarta.validation.Valid;
import org.example.springlearn.Country;
import org.example.springlearn.exception.CountryNotFoundException;
import org.example.springlearn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    private CountryService countryService;
    @GetMapping()
    public Country getCountryIndia(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("country2.xml");
        Country country = applicationContext.getBean("in",Country.class);
        return country;
    }
    @GetMapping("/list")
    public List<Country> getAllCounties(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("country.xml");
        return (List<Country>) applicationContext.getBean("countryList");
    }

    @GetMapping("/{code}")
    public Country getByCode(@PathVariable String code) throws CountryNotFoundException {
        return countryService.getCountry(code);
    }
    @PostMapping()
    public Country addCountry(@RequestBody @Valid Country country){
        return country;
    }
}
