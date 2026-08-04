import java.util.Scanner;

public class Entrycontrolled {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean reorder = false;
        int option;
        String ans;

        do {

            System.out.println("===== MEALS MENU =====");
            System.out.println("1. Burger");
            System.out.println("2. Pizza");
            System.out.println("3. Fried Chicken");
            System.out.println("0. Exit");

            System.out.print("Choose your meal: ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Meal: Burger");
                    break;

                case 2:
                    System.out.println("Meal: Pizza");
                    break;

                case 3:
                    System.out.println("Meal: Fried Chicken");
                    break;

                case 0:
                    System.out.println("No meal selected.");
                    break;

                default:
                    System.out.println("Invalid input.");
            }

            System.out.print("Do you want to order another meal? (yes/y/no): ");
            ans = input.next();

            if (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")) {
                reorder = true;
            } else {
                reorder = false;
            }

        } while (reorder == true);

        System.out.println("Thank you for ordering!");

        input.close();
    }
}
