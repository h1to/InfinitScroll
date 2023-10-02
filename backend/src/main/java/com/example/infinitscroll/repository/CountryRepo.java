package com.example.infinitscroll.repository;

import com.example.infinitscroll.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country,Long> {



}
