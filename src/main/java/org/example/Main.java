package org.example;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Set language based on user input
        System.out.print("Input language: ");
        String language = sc.nextLine();
        System.out.print("Input country: ");
        String country = sc.nextLine();
        Locale locale = new Locale(language, country);
        ResourceBundle messages = ResourceBundle.getBundle("messages", locale);

        // Create instance of shopping cart
        ShoppingCart cart = new ShoppingCart(messages);

        System.out.print(messages.getString("products_number") + ": ");
        int num = sc.nextInt();
        sc.nextLine();
        cart.fillShoppingCart(num);
        double total = cart.calculateTotalPrice();
        System.out.println(messages.getString("total_price") + ": " + total);
    }
}
