package org.experis.shop;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        //Product prod = new Product("Pera","Peranis", BigDecimal.valueOf(2.5), BigDecimal.valueOf(0.15));

        //System.out.println(prod.getDetails());

        //System.out.printf("Price: %.2f\n", prod.getPrice());
        //System.out.printf("FullPrice: %.2f\n", prod.getFullPrice());

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
                    boolean smart = scan.nextBoolean();
                    //scan.nextLine();

                    Television television = new Television(name,brand,new BigDecimal(price),new BigDecimal(vat),new BigDecimal(dimension),smart);
                    cart[i] = television;
                break;

                case 3:
                    System.out.print("Colore: ");
                    String color = scan.nextLine();

                    System.out.print("Memory: ");
                    boolean wireless = scan.nextBoolean();

                    Headphones headphones = new Headphones(name,brand,new BigDecimal(price),new BigDecimal(vat),color,wireless);
                    cart[i] = headphones;
                break;
            }
        }

        for (int i = 0; i < cart.length; i++) {
            System.out.println(cart[i].getDetails());
        }
        System.out.println(Arrays.toString(cart));

        scan.close();
    }
}
