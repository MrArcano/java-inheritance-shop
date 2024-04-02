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
}
