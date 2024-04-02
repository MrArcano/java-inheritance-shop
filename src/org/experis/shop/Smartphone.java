package org.experis.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Smartphone extends Product{

    private long codeIMEI;
    private int memory;

    public Smartphone(String name, String brand, BigDecimal price, BigDecimal vat, long codeIMEI, int memory) {
        super(name, brand, price, vat);
        this.codeIMEI = codeIMEI;
        this.memory = memory;
    }

    public String getDetails() {
        return String.format("Codice: %08d\nName: %s\nBrand: %s\nPrice: %.2f\nVat: %.2f\nIMEI: %dL\nMemory: %d\n", getCode(), getName(), getBrand(), getPrice(), getVat(), codeIMEI, memory);
    }

    public BigDecimal getFullPrice(boolean value) {
        if(value){
            BigDecimal discount = BigDecimal.valueOf(0.02);
            if(memory < 32) discount = BigDecimal.valueOf(0.05);
            return getPrice().add(getPrice().multiply(getVat())).multiply(BigDecimal.ONE.subtract(discount)).setScale(2, RoundingMode.HALF_EVEN);
        }
        return getPrice().add(getPrice().multiply(getVat())).setScale(2, RoundingMode.HALF_EVEN);
    }
}
