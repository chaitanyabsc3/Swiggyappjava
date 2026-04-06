import java.util.Scanner;

public class SwiggyCloneApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        if (login()) {
            showHome();
        } else {
            System.out.println("Invalid credentials. Exiting...");
        }
    }

    public static boolean login() {
        System.out.println("=== LOGIN PAGE ===");
        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        return username.equals("admin") && password.equals("admin");
    }

    public static void showHome() {
        while (true) {
            System.out.println("\n=== HOME PAGE ===");
            System.out.println("1. Restaurants");
            System.out.println("2. Orders");
            System.out.println("3. Profile");
            System.out.println("4. Logout");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showRestaurants();
                    break;
                case 2:
                    showOrders();
                    break;
                case 3:
                    showProfile();
                    break;
                case 4:
                    System.out.println("Logged out successfully.");
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    public static void showRestaurants() {
        System.out.println("\n=== RESTAURANTS PAGE ===");
        System.out.println("1. Pizza Hut");
        System.out.println("2. KFC");
        System.out.println("3. Dominos");
        System.out.println("Press any key to go back...");
        sc.next();
    }

    public static void showOrders() {
        System.out.println("\n=== ORDERS PAGE ===");
        System.out.println("No orders yet.");
        System.out.println("Press any key to go back...");
        sc.next();
    }

    public static void showProfile() {
        System.out.println("\n=== PROFILE PAGE ===");
        System.out.println("Username: admin");
        System.out.println("Email: admin@swiggyclone.com");
        System.out.println("Press any key to go back...");
        sc.next();
    }
}
