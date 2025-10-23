package org.example;

import java.util.*;

public class ShoppingCart {
    List<Double> items;
    ResourceBundle messages;
    Scanner sc = new Scanner(System.in);

    public ShoppingCart(ResourceBundle messages) {
        this.items = new ArrayList<Double>();
        this.messages = messages;
    }

    public double calculateItemCost(double amount, double price) {
        return Math.floor(amount) * price;
    }

    public void fillShoppingCart(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(messages.getString("item_count") + " (" + (i + 1) + "): ");
            double count = Double.parseDouble(sc.nextLine());
            System.out.print(messages.getString("item_price") + " (" + (i + 1) + "): ");
            double price = Double.parseDouble(sc.nextLine());
            this.addItem(count, price);
        }
    }

    public void addItem(double amount, double price) {
        this.items.add(calculateItemCost(amount, price));
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (double item : items) {
            total += item;
        }
        return total;
    }
}
