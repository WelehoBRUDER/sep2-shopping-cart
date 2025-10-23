package org.example;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

public class TestResourceBundle {

    @Test
    void testFinnish() {
        Locale locale = new Locale("fi", "FI");
        ResourceBundle rb = ResourceBundle.getBundle("Messages", locale);
        assertEquals("Syötä ostettavien tuotteiden määrä", rb.getString("products_number"));
        assertEquals("Kokonaishinta", rb.getString("total_price"));
        assertEquals("Syötä tuotteen määrä", rb.getString("item_count"));
        assertEquals("Syötä tuotteen hinta", rb.getString("item_price"));
    }

    @Test
    void testEnglishUK() {
        Locale locale = new Locale("en", "UK");
        ResourceBundle rb = ResourceBundle.getBundle("Messages", locale);
        assertEquals("Enter the number of products", rb.getString("products_number"));
        assertEquals("Total cost", rb.getString("total_price"));
        assertEquals("Enter item count", rb.getString("item_count"));
        assertEquals("Enter item price", rb.getString("item_price"));
    }

    @Test
    void testEnglishUS() {
        Locale locale = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("Messages", locale);
        assertEquals("Enter the number of products", rb.getString("products_number"));
        assertEquals("Total cost", rb.getString("total_price"));
        assertEquals("Enter item count", rb.getString("item_count"));
        assertEquals("Enter item price", rb.getString("item_price"));
    }

    @Test
    void testSwedish() {
        Locale locale = new Locale("sv", "SE");
        ResourceBundle rb = ResourceBundle.getBundle("Messages", locale);
        assertEquals("Ange antalet produkter", rb.getString("products_number"));
        assertEquals("Totalt pris", rb.getString("total_price"));
        assertEquals("Ange antal artiklar", rb.getString("item_count"));
        assertEquals("Ange artikelpris", rb.getString("item_price"));
    }

    @Test
    void testJapanese() {
        Locale locale = new Locale("ja", "JP");
        ResourceBundle rb = ResourceBundle.getBundle("Messages", locale);
        assertEquals("「購入する商品の数を入力してください」", rb.getString("products_number"));
        assertEquals("「合計金額」", rb.getString("total_price"));
        assertEquals("「商品の数量を入力してください」", rb.getString("item_count"));
        assertEquals("「商品の価格を入力してください」", rb.getString("item_price"));
    }
}
