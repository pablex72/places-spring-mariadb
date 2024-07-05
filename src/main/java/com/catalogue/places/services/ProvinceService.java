package com.catalogue.places.services;

import com.catalogue.places.entities.Province;
import com.catalogue.places.repositories.ProvinceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    public List<Province> getProvincesByCountryId(Long countryId) {
        return provinceRepository.findByCountryId(countryId);
    }
}
