import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int num = sc.nextInt();
        sc.nextLine();
        double[][] cart = fillShoppingCart(num, sc);
        double total = calculateTotalPrice(cart);
        System.out.println("Total price is: " + total);
    }

    public static double[][] fillShoppingCart(int size, Scanner sc) {
        double[][] cart = new double[size][2];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter item count (" + (i+1) + "): ");
            double count = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter item price (" + (i+1) + "): ");
            double price = sc.nextDouble();
            sc.nextLine();
            System.out.println();
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
