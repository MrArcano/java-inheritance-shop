package org.experis.shop;

import java.math.BigDecimal;

public class Smartphone extends Product{

    private int codeIMEI;
    private int memory;

    public Smartphone(String name, String brand, BigDecimal price, BigDecimal vat, int codeIMEI, int memory) {
        super(name, brand, price, vat);
        this.codeIMEI = codeIMEI;
        this.memory = memory;
    }
}
