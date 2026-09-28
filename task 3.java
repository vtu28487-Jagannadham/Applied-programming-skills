import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of delivery points: ");
        int n = sc.nextInt();

        int[] route = new int[n];

        System.out.println("Enter delivery point numbers:");
        for (int i = 0; i < n; i++) {
            route[i] = sc.nextInt();
        }

        System.out.println("\n--- Original Delivery Route ---");
        for (int i = 0; i < n; i++) {
            System.out.print(route[i] + " ");
        }

        // Check circular connection
        System.out.println("\n\n--- Circular Route Check ---");

        boolean valid = true;

        for (int i = 0; i < n; i++) {
            int current = route[i];
            int next = route[(i + 1) % n];

            if (current == next) {
                valid = false;
                System.out.println("Problem found between point "
                        + current + " and " + next);
            }
        }

        if (valid) {
            System.out.println("Route is valid and properly connected.");
        } else {
            System.out.println("Route needs repair.");
        }

        // Display circular route
        System.out.println("\n--- Circular Delivery Route ---");
        for (int i = 0; i < n; i++) {
            System.out.print(route[i] + " -> ");
        }
        System.out.println(route[0] + " (Back to Start)");

        sc.close();
    }
}
