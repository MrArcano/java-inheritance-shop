package org.experis.shop;

import java.math.BigDecimal;

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
}
