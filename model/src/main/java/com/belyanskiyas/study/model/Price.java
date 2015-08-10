package com.belyanskiyas.study.model;

/**
 * Created by Alexander Beliansky.
 */
public enum Price {
    TO_FIVE("to $5"),
    FROM_FIVE_TO_TEN("from $5 to $10"),
    FROM_TEN_TO_FIFTEEN("from $10 to $15"),
    FROM_FIFTEEN_TO_TWENTY("from $15 to $20");

    private String label;

    private Price(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
