public class IfAndIfElse { 
    public static void main(String[] args) {

        int score = 75;
        boolean hasID = false;
        char section = 'C';

        if (hasID) {
            System.out.println("Student is allowed to enter.");
        }

        if (score >= 80) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }

        switch (section) {
            case 'A':
                System.out.println("Section A - Diamond");
                break;

            case 'B':
                System.out.println("Section B - Emerald");
                break;

            case 'C':
                System.out.println("Section C - Peridot");
                break;

            default:
                System.out.println("Unknown Section");
        }
    }
}
