// This is a simple Java program that demonstrates basic structures and syntax.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("I'm Mark Clarence Cabatay!");
        System.out.println("I'm 18 years old!");
        System.out.println("12345678910");
        System.out.println("I live in Caloocan City!");
        System.out.println("I am a student at Grade 12 Peridot!");

        System.out.println("Addition");
        System.out.println("5 + 3 = " + (5 + 3));

        System.out.println("Subtraction");
        System.out.println("5 - 3 = " + (5 - 3));

        System.out.println("Multiplication");
        System.out.println("5 * 3 = " + (5 * 3));

        System.out.println("Division");
        System.out.println("5 / 3 = " + (5 / 3.0));

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("hello")) {
            System.out.println("cute ka!!");
        } else {
            System.out.println("cannot find");
        }
    }
}