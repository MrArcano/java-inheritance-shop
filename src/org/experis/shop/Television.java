package org.experis.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Television extends Product {

    private BigDecimal dimension;
    private boolean smartTV;

    public Television(String name, String brand, BigDecimal price, BigDecimal vat, BigDecimal dimension, boolean smartTV) {
        super(name, brand, price, vat);
        this.dimension = dimension;
        this.smartTV = smartTV;
    }

    public String getDetails() {
        return String.format("Codice: %08d\nName: %s\nBrand: %s\nPrice: %.2f\nVat: %.2f\nDimension: %s\nSmart: %b\n", getCode(), getName(), getBrand(), getPrice(), getVat(), dimension.toString(), smartTV);
    }

    public BigDecimal getFullPrice(boolean value) {
        if(value){
            BigDecimal discount = BigDecimal.valueOf(0.02);
            if(!smartTV) discount = BigDecimal.valueOf(0.10);
            return getPrice().add(getPrice().multiply(getVat())).multiply(BigDecimal.ONE.subtract(discount)).setScale(2, RoundingMode.HALF_EVEN);
        }
        return getPrice().add(getPrice().multiply(getVat())).setScale(2, RoundingMode.HALF_EVEN);
    }
}


