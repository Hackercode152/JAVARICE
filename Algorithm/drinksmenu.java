 
    import java.util.Scanner;

public class drinksmenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== DRINK MENU =====");
        System.out.println("1. Alfonso");
        System.out.println("2. Emperador");
        System.out.println("3. Black label");

        System.out.print("Choose your drink (1-3): ");
        int choice = input.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Drink: Alfonso");
                System.out.println("Flavor: PLATINUM");
                System.out.println("Price: ₱500");
                break;

            case 2:
                System.out.println("Drink: Emperador");
                System.out.println("Flavor: CLVB");
                System.out.println("Price: ₱800");
                break;

            case 3:
                System.out.println("Drink: Johnnie Walker ");
                System.out.println("Flavor: Black label");
                System.out.println("Price: ₱999");
                break;

            default:
                System.out.println("Idiot! just choose from 1 to 3.");
        }

        input.close();
    }
}

