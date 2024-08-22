package com.db.db.Domain.Service.Country;

import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.db.db.Domain.Entities.Country;

public interface CountryInterface {


    Page<Country> findAll(Pageable pageable);

    Optional<Country> findById(Integer id);

    Country save(Country country);
    
    Country updateOneById(Integer id , Country country); 

    Optional<Country> delete(Integer id);

    Optional<Country> buscar(String name);  

}
