package com.fasttrack.Exercise4;

import com.fasttrack.Exercise3.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("onion", 3.25f, 23, "Vegetables");
        Product product2 = new Product("shirt", 59.99f, 0, "Clothes");
        Product product3 = new Product("battery", 7.49f, 9, "Electronics");
/*
        System.out.println();
        System.out.println("name: " + product1.getName());
        System.out.println("price: " + product1.getPrice());
        System.out.println("quantity: " + product1.getQuantity());
        System.out.println("in stock: " + product1.hasStock());
        System.out.println("category: " + product1.getCategory());

        System.out.println();
        System.out.println("name: " + product2.getName());
        System.out.println("price: " + product2.getPrice());
        System.out.println("quantity: " + product2.getQuantity());
        System.out.println("in stock: " + product2.hasStock());
        System.out.println("category: " + product2.getCategory());

        System.out.println();
        System.out.println("name: " + product3.getName());
        System.out.println("price: " + product3.getPrice());
        System.out.println("quantity: " + product3.getQuantity());
        System.out.println("in stock: " + product3.hasStock());
        System.out.println("category: " + product3.getCategory());
 */
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
