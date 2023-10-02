package com.example.infinitscroll.service;

import com.example.infinitscroll.entity.Country;
import com.example.infinitscroll.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class CountryService {

    private CountryRepo countryRepo;

    @Autowired
    public CountryService(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }


    public Page<Country> getAll(Pageable pageable) {
        return countryRepo.findAll(pageable);
    }

}
