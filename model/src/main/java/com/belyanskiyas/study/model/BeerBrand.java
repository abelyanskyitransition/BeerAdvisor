package com.belyanskiyas.study.model;

/**
 * Created by Alexander Beliansky.
 */
public class BeerBrand {
    private String name;
    private Color color;
    private Price price;

    public BeerBrand(String name, Color color, Price price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public BeerBrand(BeerBrand beerBrand) {
        this.name = beerBrand.name;
        this.color = beerBrand.color;
        this.price = beerBrand.price;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Price getPrice() {
        return price;
    }
}
