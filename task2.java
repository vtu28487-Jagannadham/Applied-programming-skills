import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String product = sc.nextLine();

        System.out.print("Enter available stock: ");
        int stock = sc.nextInt();

        System.out.print("Enter number of sales: ");
        int sales = sc.nextInt();

        System.out.println("\n--- Warehouse Product Analysis ---");
        System.out.println("Product: " + product);
        System.out.println("Available Stock: " + stock);
        System.out.println("Sales Frequency: " + sales);

        if (sales >= 50) {
            System.out.println("Category: Fast Moving Product");
        } else if (sales >= 20) {
            System.out.println("Category: Medium Moving Product");
        } else {
            System.out.println("Category: Slow Moving Product");
        }

        if (stock <= 10) {
            System.out.println("Stock Status: LOW STOCK - Reorder Required");
        } else {
            System.out.println("Stock Status: Stock Available");
        }

        sc.close();
    }
}

