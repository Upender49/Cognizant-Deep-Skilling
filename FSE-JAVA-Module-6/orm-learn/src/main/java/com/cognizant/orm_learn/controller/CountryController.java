package com.cognizant.orm_learn.controller;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    private CountryService countryService;
    @GetMapping
    public List<Country> testGetAllCountries(){
        return countryService.getAllCountries();
    }
    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code){
        return countryService.getCountry(code);
    }
    @PostMapping
    public void addCountry(@RequestBody Country country){
        countryService.addCountry(country);
    }
    @DeleteMapping("/{code}")
    public void deleteCountry(@PathVariable String code){
        countryService.deleteCountry(code);
    }
    @PutMapping()
    public void updateCountry(@RequestBody Country country){
        countryService.updateCountry(country);
    }
    @GetMapping("/search")
    public List<Country> findByNameContainingIgnoreCase(@RequestParam String name){
        return countryService.findByNameContainingIgnoreCase(name);
    }
    @GetMapping("/search/sorted")
    public List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(@RequestParam String name){
        return countryService.findByNameContainingIgnoreCaseOrderByNameAsc(name);
    }
    @GetMapping("/search/start")
    public List<Country> findByNameStartingWithIgnoreCase(@RequestParam String name){
        return countryService.findByNameStartingWithIgnoreCase(name);
    }

}
