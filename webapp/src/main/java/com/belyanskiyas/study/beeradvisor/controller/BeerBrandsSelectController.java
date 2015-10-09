package com.belyanskiyas.study.beeradvisor.controller;

import com.belyanskiyas.study.model.BeerBrand;
import com.belyanskiyas.study.model.BeerParameters;
import com.belyanskiyas.study.model.Color;
import com.belyanskiyas.study.model.Price;
import com.belyanskiyas.study.service.BeerExpert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Alexander Beliansky.
 */
@Controller
public class BeerBrandsSelectController {

    @Autowired
    private BeerExpert beerExpert;

    @RequestMapping(value = "brands", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public List<BeerBrand> getBrands(@RequestBody UIBeerParameters uiBeerParameters) {
        BeerParameters beerParameters = new BeerParameters();
        beerParameters.setColor(Color.valueOf(uiBeerParameters.getColor().toUpperCase()));
        beerParameters.setPrice(Price.valueOf(uiBeerParameters.getPrice().toUpperCase()));

        return beerExpert.getBrands(beerParameters);
    }

}
