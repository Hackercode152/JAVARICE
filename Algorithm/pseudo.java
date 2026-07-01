import java.util.Scanner;

public class pseudo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter grade: ");
        int grade = input.nextInt();

        if (grade >= 75) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}