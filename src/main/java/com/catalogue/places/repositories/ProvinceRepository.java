package com.catalogue.places.repositories;


import com.catalogue.places.entities.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProvinceRepository extends JpaRepository<Province, Long> {
    List<Province> findByCountryId(Long countryId);
}
