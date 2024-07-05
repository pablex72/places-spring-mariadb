package com.catalogue.places.controllers;


import com.catalogue.places.entities.Province;
import com.catalogue.places.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/provinces")
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/country/{countryId}")
    public List<Province> getProvincesByCountryId(@PathVariable Long countryId) {
        return provinceService.getProvincesByCountryId(countryId);
    }
}
