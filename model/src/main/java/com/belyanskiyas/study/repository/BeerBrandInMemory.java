package com.belyanskiyas.study.repository;

import com.belyanskiyas.study.model.BeerBrand;
import com.belyanskiyas.study.model.BeerParameters;
import com.belyanskiyas.study.model.Color;
import com.belyanskiyas.study.model.Price;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander Beliansky.
 */
@Repository
public class BeerBrandInMemory implements BeerBrandRepository {

    private List<BeerBrand> brands = new ArrayList<>(10);

    public BeerBrandInMemory() {
        brands.add(new BeerBrand("Jack Amber", Color.AMBER, Price.TO_FIVE));
        brands.add(new BeerBrand("Red Moose", Color.AMBER, Price.FROM_FIVE_TO_TEN));

        brands.add(new BeerBrand("Jail Pale Ale", Color.LIGHT, Price.FROM_FIVE_TO_TEN));
        brands.add(new BeerBrand("Gout Stout", Color.LIGHT, Price.FROM_FIVE_TO_TEN));
    }

    public List<BeerBrand> getBrands(BeerParameters parameters) {
        List<BeerBrand> result = new ArrayList<>(this.brands.size());

        brands.stream().filter(brand -> parameters.getColor().equals(brand.getColor())
                                        && parameters.getPrice().equals(brand.getPrice()))
                .forEach(brand -> result.add(new BeerBrand(brand)));

        return result;
    }
}
