package com.example.infinitscroll.controller;

import com.example.infinitscroll.entity.Country;
import com.example.infinitscroll.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("countries")
public class CountryController {

    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }


    @GetMapping("all")
    public Page<Country> getAll(@RequestParam Integer page) throws InterruptedException {
        Pageable pageableRequest = PageRequest.of(page,2);
        Thread.sleep(1500); //иммтация загрузки
        return countryService.getAll(pageableRequest);
    }

}
