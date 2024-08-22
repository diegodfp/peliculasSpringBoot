package com.db.db.Domain.Service.Country;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.db.db.Domain.Entities.Country;
import com.db.db.Domain.Repository.CountryRepository;

@Service
public class CountryImpl implements CountryInterface {

    @Autowired 
    private CountryRepository countryRepository ;

    @Override
    public Page<Country> findAll(Pageable pageable) {
        return countryRepository.findAll(pageable);
    } 

    @Override
    @Transactional(readOnly = true)
    public Optional<Country> findById(Integer id) {
        return countryRepository.findById(id);
    }

    @Override
    public Country save(Country country) {
        
        return countryRepository.save(country);
    }

    @Override
    public Country updateOneById(Integer id, Country country) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateOneById'");
    }

    @Override
    @Transactional
    public Optional<Country> delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
 
    @Override
    public Optional<Country> buscar(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarCountryByName'");
    }  



}
