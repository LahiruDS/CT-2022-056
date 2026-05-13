import java.util.Scanner;

public class Q5 {


    public static double getPrice(int id) {
        switch (id) {
            case 1: return 3.49; // Tofu Burger
            case 2: return 4.59; // Cajun Chicken
            case 3: return 3.99; // Buffalo Wings
            case 4: return 2.99; // Rainbow Fillet
            case 5: return 0.79; // Rice Cracker
            case 6: return 0.69; // No-Salt Fries
            case 7: return 1.09; // Zucchini
            case 8: return 0.59; // Brown Rice
            case 9: return 1.99; // Cafe Mocha
            case 10: return 1.90; // Cafe Latte
            case 11: return 2.49; // Espresso
            case 12: return 0.99; // Oolong Tea
            default: return 0.0;
        }
    }


    public static String getName(int id) {
        switch (id) {
            case 1: return "Tofu Burger";
            case 2: return "Cajun Chicken";
            case 3: return "Buffalo Wings";
            case 4: return "Rainbow Fillet";
            case 5: return "Rice Cracker";
            case 6: return "No-Salt Fries";
            case 7: return "Zucchini";
            case 8: return "Brown Rice";
            case 9: return "Cafe Mocha";
            case 10: return "Cafe Latte";
            case 11: return "Espresso";
            case 12: return "Oolong Tea";
            default: return "Unknown Item";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] orderIDs = new int[100];
        int[] orderCounts = new int[100];
        int index = 0;
        boolean run = true;

        while (run) {
            System.out.println("\nSelect a menu category:");
            System.out.println("1. Entree");
            System.out.println("2. Side dish");
            System.out.println("3. Drink");
            System.out.println("4. Finish Order");

            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("1.Tofu Burger $3.49");
                    System.out.println("2.Cajun Chicken $4.59");
                    System.out.println("3.Buffalo Wings $3.99");
                    System.out.println("4.Rainbow Fillet $2.99");
                    break;
                case 2:
                    System.out.println("5.Rice Cracker $0.79");
                    System.out.println("6.No-Salt Fries $0.69");
                    System.out.println("7.Zucchini $1.09");
                    System.out.println("8.Brown Rice $0.59");
                    break;
                case 3:
                    System.out.println("9.Cafe Mocha $1.99");
                    System.out.println("10.Cafe Latte $1.90");
                    System.out.println("11.Espresso $2.49");
                    System.out.println("12.Oolong Tea $0.99");
                    break;
                case 4:
                    run = false;
                    continue;
                default:
                    System.out.println("Invalid selection");
                    continue;
            }

            System.out.print("Enter item ID to order: ");
            orderIDs[index] = scanner.nextInt();

            System.out.print("Enter quantity: ");
            orderCounts[index] = scanner.nextInt();

            index++;
        }


        double total = 0.0;
        System.out.println("\n----- Your Order -----");
        for (int i = 0; i < index; i++) {
            String name = getName(orderIDs[i]);
            double price = getPrice(orderIDs[i]);
            int qty = orderCounts[i];
            double itemTotal = price * qty;
            total += itemTotal;

            System.out.println(name + " x " + qty + " = $" + String.format("%.2f", itemTotal));
        }

        System.out.println("----------------------");
        System.out.println("Total Bill: $" + String.format("%.2f", total));

        scanner.close();
    }
}