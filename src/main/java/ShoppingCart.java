import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Set language based on user input
        System.out.print("Input language: ");
        String language = sc.nextLine();
        System.out.print("Input country: ");
        String country = sc.nextLine();
        Locale locale = new Locale(language, country);
        ResourceBundle messages = ResourceBundle.getBundle("messages", locale);

        System.out.print(messages.getString("products_number") + ": ");
        int num = sc.nextInt();
        sc.nextLine();
        double[][] cart = fillShoppingCart(num, sc, messages);
        double total = calculateTotalPrice(cart);
        System.out.println(messages.getString("total_price") + ": " + total);
    }

    public static double[][] fillShoppingCart(int size, Scanner sc, ResourceBundle messages) {
        double[][] cart = new double[size][2];
        for (int i = 0; i < size; i++) {
            System.out.print(messages.getString("item_count") + " (" + (i+1) + "): ");
            double count = Double.parseDouble(sc.nextLine());
            System.out.print(messages.getString("item_price") + " (" + (i+1) + "): ");
            double price = Double.parseDouble(sc.nextLine());
            cart[i][0] = Math.floor(count);
            cart[i][1] = price;
        }
        return cart;
    }

    public static double calculateTotalPrice(double[][] items) {
        double total = 0.0;
        for (double[] item : items) {
            double amnt = item[0];
            double price = item[1];
            total += amnt * price;
        }
        return total;
    }
}
