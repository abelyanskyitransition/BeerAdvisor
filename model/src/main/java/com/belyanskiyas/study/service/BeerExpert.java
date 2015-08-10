package com.belyanskiyas.study.service;

import com.belyanskiyas.study.model.BeerBrand;
import com.belyanskiyas.study.model.BeerParameters;
import com.belyanskiyas.study.repository.BeerBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alexander Beliansky.
 */
@Service
public class BeerExpert {

    @Autowired
    public BeerBrandRepository beerBrandRepository;

    public List<BeerBrand> getBrands(BeerParameters parameters) {
        return beerBrandRepository.getBrands(parameters);
    }
}
