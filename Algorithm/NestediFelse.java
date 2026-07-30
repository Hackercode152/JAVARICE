import java.util.Scanner;

public class NestediFelse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = input.nextInt();

        if (grade >= 75) {
            System.out.println("You Passed!");

            if (grade >= 90) {
                System.out.println("With High Honors");
            } else {
                System.out.println("Passed but no honors");
            }

        } else {
            System.out.println("You Failed");

            if (grade >= 70) {
                System.out.println("You are close to passing.");
            } else {
                System.out.println("You need more improvement.");
            }
        }

      
    }
}
