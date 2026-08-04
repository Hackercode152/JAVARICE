import java.util.Scanner;

public class Entrycontrolled {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean reorder = false;
        int option;
        String ans;

        do {

            System.out.println("===== STREET FOOD =====");
            System.out.println("1. Kwek-Kwek");
            System.out.println("2. Fishball");
            System.out.println("3. Kikiam");
            System.out.println("0. Exit");

            System.out.print("Choose your meal: ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("Meal: Kwek-Kwek");
                    break;

                case 2:
                    System.out.println("Meal: Fishball");
                    break;

                case 3:
                    System.out.println("Meal: Kikiam");
                    break;

                case 4:
                    System.out.println("No meal selected.");
                    break;

                default:
                    System.out.println("Invalid input.");
            }

            System.out.print("Do you want to order another meal? (yes/or/no): ");
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
