package com.belyanskiyas.study.repository;

import com.belyanskiyas.study.model.BeerBrand;
import com.belyanskiyas.study.model.BeerParameters;

import java.util.Collection;

/**
 * Created by Alexander Beliansky.
 */
public interface BeerBrandRepository {
    Collection<BeerBrand> getBrands(BeerParameters parameters);
}
