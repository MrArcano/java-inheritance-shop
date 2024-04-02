package org.experis.shop;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        boolean card = false;

        Product[] cart = new Product[3];
        cart[0] = new Smartphone("GalaxyS24","Samsung", new BigDecimal("550.50"),new BigDecimal("0.22"),123456789123456L,64);
        cart[1] = new Television("MyTelevision69","MarcaCavallo", new BigDecimal("1550.50"),new BigDecimal("0.22"),new BigDecimal("48"),true);
        cart[2] = new Headphones("Syneizer","MarcaCavallo", new BigDecimal("450.50"),new BigDecimal("0.22"),"Red",true);

        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanti prodotti vuoi inserire: ");
        int size = Integer.parseInt(scan.nextLine());
        Product[] cart = new Product[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Vuoi inserire:");
            System.out.println("1. Smartphone");
            System.out.println("2. Televisore");
            System.out.println("3. Cuffie");

            int choice = Integer.parseInt(scan.nextLine());

            System.out.print("Nome: ");
            String name = scan.nextLine();
            System.out.print("Brand: ");
            String brand = scan.nextLine();
            System.out.print("Price: ");
            String price = scan.nextLine();
            System.out.print("Vat: ");
            String vat = scan.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Codice IMEI: ");
                    long codeImei = Long.parseLong(scan.nextLine());

                    System.out.print("Memory: ");
                    int memory = Integer.parseInt(scan.nextLine());

                    Smartphone smartphone = new Smartphone(name,brand,new BigDecimal(price),new BigDecimal(vat),codeImei,memory);
                    cart[i] = smartphone;
                break;

                case 2:
                    System.out.print("Dimensione: ");
                    String dimension = scan.nextLine();

                    System.out.print("Smart: ");
                    boolean smart = Boolean.parseBoolean(scan.nextLine());

                    Television television = new Television(name,brand,new BigDecimal(price),new BigDecimal(vat),new BigDecimal(dimension),smart);
                    cart[i] = television;
                break;

                case 3:
                    System.out.print("Colore: ");
                    String color = scan.nextLine();

                    System.out.print("Memory: ");
                    boolean wireless = Boolean.parseBoolean(scan.nextLine());

                    Headphones headphones = new Headphones(name,brand,new BigDecimal(price),new BigDecimal(vat),color,wireless);
                    cart[i] = headphones;
                break;
            }
        }

         */

        System.out.println("----------------------------------------");
        System.out.println("-----------DETTAGLIO CARRELLO-----------");
        System.out.println("----------------------------------------");

        for (Product product : cart) {
            System.out.println(product.getDetails());
        }

        System.out.println("-----------------------------------------");
        System.out.println("----------------SCONTRINO----------------");
        System.out.println("-----------------------------------------");

        for (Product product : cart) {
            System.out.println(product.getName() + " - " + product.getFullPrice(card));
        }

        //scan.close();
    }
}
