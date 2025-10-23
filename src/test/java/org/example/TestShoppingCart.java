package org.example;

import org.junit.jupiter.api.Test;

import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

public class TestShoppingCart {
    ResourceBundle messages = ResourceBundle.getBundle("Messages");
    ShoppingCart shoppingCart = new ShoppingCart(messages);

    @Test
    void testAddingItem() {
        this.shoppingCart.items.clear();
        this.shoppingCart.addItem(5, 4);
        assertEquals(20, this.shoppingCart.items.get(0));
        this.shoppingCart.addItem(59, 2.857);
        assertEquals(168.563, this.shoppingCart.items.get(1), 0.001);
    }

    @Test
    void testCalculatingAllItems() {
        this.shoppingCart.items.clear();
        this.shoppingCart.addItem(5, 4);
        this.shoppingCart.addItem(59, 2.857);
        assertEquals(188.563, this.shoppingCart.calculateTotalPrice(), 0.001);
    }
}
