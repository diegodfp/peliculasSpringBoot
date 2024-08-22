package com.db.db.Web.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.db.Domain.Entities.Country;
import com.db.db.Domain.Service.Country.CountryInterface;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;






@RestController
@RequestMapping("/api/countries")

public class CountryController {

    @Autowired 
    private CountryInterface service;


    @GetMapping("/all")
    public ResponseEntity<Page<Country>> findAll(Pageable pageable) {
        
        Page<Country> countryPage = service.findAll(pageable);

        if (countryPage.hasContent()) {
            return ResponseEntity.ok(countryPage);
        }

        return ResponseEntity.notFound().build();
        
        
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> view(@PathVariable Integer id) {
        Optional<Country> countryOpt = service.findById(id);
        if (countryOpt.isPresent()) {
            return ResponseEntity.ok(countryOpt.orElseThrow());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Country> create(@Valid @RequestBody Country country) {
       Country countryNew = service.save(country);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(countryNew);
    }
        
    


    

}
