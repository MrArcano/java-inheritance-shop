package org.experis.shop;

import java.math.BigDecimal;

public class Television extends Product {

    private BigDecimal dimension;
    private boolean smartTV;

    public Television(String name, String brand, BigDecimal price, BigDecimal vat, BigDecimal dimension, boolean smartTV) {
        super(name, brand, price, vat);
        this.dimension = dimension;
        this.smartTV = smartTV;
    }

    public String getDetails() {
        return String.format("Codice: %08d\nName: %s\nBrand: %s\nPrice: %.2f\nVat: %.2f\nDimension: %s\nisSmart: %b\n", getCode(), getName(), getBrand(), getPrice(), getVat(), dimension.toString(), smartTV);
    }
}


