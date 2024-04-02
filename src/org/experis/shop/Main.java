package org.experis.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product prod = new Product("Pera","Peranis", BigDecimal.valueOf(2.5), BigDecimal.valueOf(0.15));

        System.out.println(prod.getDetails());

        System.out.printf("Price: %.2f\n", prod.getPrice());
        System.out.printf("FullPrice: %.2f\n", prod.getFullPrice());
    }
}
