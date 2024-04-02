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
}


