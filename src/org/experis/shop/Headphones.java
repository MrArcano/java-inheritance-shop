package org.experis.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Headphones extends Product{

    private String color;
    private boolean wireless;

    public Headphones(String name, String brand, BigDecimal price, BigDecimal vat, String color, boolean wireless) {
        super(name, brand, price, vat);
        this.color = color;
        this.wireless = wireless;
    }

    public String getDetails() {
        return String.format("Codice: %08d\nName: %s\nBrand: %s\nPrice: %.2f\nVat: %.2f\nColor: %s\nisSmart: %b\n", getCode(), getName(), getBrand(), getPrice(), getVat(), color, wireless);
    }

    public BigDecimal getFullPrice(boolean value) {
        if(value){
            BigDecimal discount = BigDecimal.valueOf(0.02);
            if(!wireless) discount = BigDecimal.valueOf(0.07);
            return getPrice().add(getPrice().multiply(getVat())).multiply(BigDecimal.ONE.subtract(discount)).setScale(2, RoundingMode.HALF_EVEN);
        }
        return getPrice().add(getPrice().multiply(getVat())).setScale(2, RoundingMode.HALF_EVEN);
    }
}
